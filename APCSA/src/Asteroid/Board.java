package Asteroid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends Canvas implements KeyListener, Runnable
{

	private boolean[] keys;
	private BufferedImage back;
	
	
	private Spaceship ship;
	
	//ASTEROID PARAMETERS
//	private ArrayList <Asteroid> ast; 
//	private int size;
//	private int apos;
	
	
	private long starttime;

	public Board()
	{
		setBackground(Color.black);

		keys = new boolean[5];	
		this.addKeyListener(this);
		new Thread(this).start();
		
		ship = new Spaceship(200,200,3);
//		ast = new ArrayList<Asteroid>();


		setVisible(true);
	}

	public void update(Graphics window)
	{
	   paint(window);
	}

	public void paint( Graphics window )
	{
		//BACKGROUND
		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("ASTEROID", 25, 50);
		
		
		ship.draw(graphToBack);
		
		//SHIP MOVEMENT
		if(keys[0] == true)
		{
			ship.move("W");
		}
		if(keys[1] == true)
		{
			ship.move("A");
		}
		if(keys[2] == true)
		{
			ship.move("S");
		}
		if(keys[3] == true)
		{
			ship.move("D");
		}
		if(keys[4] == true)
		{
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) { }
	

 public void run()
 {
 	try
 	{
 		while(true)
 		{
 		   Thread.currentThread().sleep(5);
          repaint();
       }
    }catch(Exception e)
    {
    }
	}
}


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

public class Board extends Canvas implements KeyListener, Runnable
{

	private boolean[] keys;
	private BufferedImage back;
	
	private Spaceship ship;
	private Asteroid ast;

	public Board()
	{
		setBackground(Color.black);

		keys = new boolean[5];	
		this.addKeyListener(this);
		new Thread(this).start();
		
		ship = new Spaceship(200,200,3);
		ast = new Asteroid(400,200,5);

		setVisible(true);
	}

 public void update(Graphics window)
 {
	   paint(window);
 }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("ASTEROID", 25, 50);
		
		ship.draw(graphToBack);
		ast.draw(graphToBack);
		
		if(keys[0] == true)
		{
		}
		if(keys[1] == true)
		{
		}
		if(keys[2] == true)
		{
		}
		if(keys[3] == true)
		{
		}
		
		if(keys[4] == true)
		{
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
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
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
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


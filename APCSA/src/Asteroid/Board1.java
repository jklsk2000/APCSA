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
import java.io.File;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class Board1 extends Canvas implements KeyListener, Runnable
{

	private Spaceship ship;
	private ArrayList <Asteroid> ast;
	private ArrayList <PowerUp> pu;
	
	private Random rand;
	private int lives;
	private int ammocnt;

	private boolean[] keys;
	private BufferedImage back;
	

	public Board1()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		rand = new Random();
		ship = new Spaceship(500,400,3);
		ast = new ArrayList<Asteroid>();
		pu = new ArrayList <PowerUp> ();
		
		lives = 3;
		ammocnt = 0;

		this.addKeyListener(this);
		new Thread(this).start();

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
		graphToBack.drawString("ASTEROID ", 25, 50 );
		graphToBack.drawString("LIVES: " + lives,25,70);
		graphToBack.drawString("AMMO: " + ammocnt,25,90);

		ship.draw(graphToBack);
		
		
		int r = (int)(Math.random() * 800);
		int sz = rand.nextInt(3);
		int go = rand.nextInt(1000000);
		if (go > 980000){
			ast.add(new Asteroid(r,0,2,sz));
		}		
		
		for(int i = 0; i < ast.size(); i++){
//			if (lives == 0){
//				break;
//			}
			ast.get(i).draw(graphToBack);
			if (ship.cTop(ast.get(i)) || ship.cBottom(ast.get(i)) || ship.cRight(ast.get(i)) || ship.cLeft(ast.get(i))){
				ast.get(i).setPos(1000, 1000);
				lives--;
			}
		}
		
		int s = (int)(Math.random() * 800);
		int gopu = rand.nextInt(1000000);
		if (gopu > 999000){
			pu.add(new PowerUp(s,0,3));
		}
		
		for(int i = 0; i < pu.size(); i++){
			pu.get(i).draw(graphToBack);
			if (ship.cpTop(pu.get(i)) || ship.cpBottom(pu.get(i))){
				pu.get(i).setPos(1000, 1000);
				ammocnt++;
			}
		}

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


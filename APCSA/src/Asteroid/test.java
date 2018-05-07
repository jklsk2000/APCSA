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

import unit17.Ammo;

public class test extends Canvas implements KeyListener, Runnable
{

	private Spaceship ship;
	private ArrayList <Asteroid> ast;
	private int chance = 980000;
	private ArrayList <PowerUp> pu;
	private ArrayList <Laser> l;
	private Laser laser;
	
	private Random rand;
	private int lives;
	private int ammocnt;
	
	private long start;

	private boolean[] keys;
	private BufferedImage back;
	

	public test()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		rand = new Random();
		ship = new Spaceship(500,400,3);
		ast = new ArrayList<Asteroid>();
		pu = new ArrayList <PowerUp>();
		l = new ArrayList <Laser>();
		laser = new Laser (ship.getX(), ship.getY(), 3);
		
		lives = 3;
		ammocnt = 0;
		
		start = System.currentTimeMillis();

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
		graphToBack.drawString("AMMO: " + ammocnt + " / 5",25,90);

		ship.draw(graphToBack);
		
		//KEEPING SHIP IN BOUNDS
		if (ship.getX() < 0){
			ship.setX(0);
		}
		if (ship.getX() > 760){
			ship.setX(760);
		}
		if (ship.getY() < 0){
			ship.setY(0);
		}
		if (ship.getY() > 545){
			ship.setY(545);
		}
		
		//NO MORE LIVES
		if (lives == 0){
			ship.explode();
		}
		
		
		
		long current = System.currentTimeMillis();
		if((current - start) % 1000 == 1){
			chance = chance - 500;
			System.out.println(chance);
			System.out.println(current);
		}
		int r = (int)(Math.random() * 800);
		int sz = rand.nextInt(3);
		int go = rand.nextInt(1000000);
		if (go > chance){
			ast.add(new Asteroid(r,0,2,sz));
		}		
		
		for(int i = 0; i < ast.size(); i++){
			if (lives == 0){
				break;
			}
			ast.get(i).draw(graphToBack);
			if (ship.cTop(ast.get(i)) || ship.cBottom(ast.get(i)) || ship.cRight(ast.get(i)) || ship.cLeft(ast.get(i))){
				ast.get(i).setPos(1000, 1000);
				lives--;
			}
		}
		
		int s = (int)(Math.random() * 800);
		int gopu = rand.nextInt(1000000);
		
		if (ammocnt < 5){
			if (gopu > 999000){
				pu.add(new PowerUp(s,0,2));
			}
		}
		
		for(int i = 0; i < pu.size(); i++){
			if (lives == 0){
				break;
			}
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
			if(ammocnt > 0){
				laser = new Laser (ship.getX() + 15, ship.getY(), 2);
				l.add(laser);
				laser = new Laser (ship.getX() + 2, ship.getY() + 10, 2);
				l.add(laser);
				laser = new Laser (ship.getX() + 28, ship.getY() + 10, 2);
				l.add(laser);
				laser = new Laser (ship.getX() - 10, ship.getY() + 20, 2);
				l.add(laser);
				laser = new Laser (ship.getX() + 40, ship.getY() + 20, 2);
				l.add(laser);
				ammocnt--;
				keys[4] = false;
			}
		}
		
		for(Laser la : l){
			la.draw(graphToBack);
			for (int i = 0; i < ast.size(); i++){
				if (la.clTop(ast.get(i))){
					ast.get(i).setPos(2000,2000);
					la.setPos(3000,3000);
				}
			}
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
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
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
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
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


package Asteroid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.Random;

public class Asteroid extends MovingThing
{
	private int speed;
	private Image image;
	private Random rand;

	public Asteroid()
	{
		this(0,0,0);
		rand = new Random();
	}

	public Asteroid(int x, int y)
	{
		this(x,y,0);
	}

	public Asteroid(int x, int y, int s)
	{
		super(x, y);
		speed=s;		
		try
		{
			image = ImageIO.read(new File("hast.png"));
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),null);
	}

	public String toString()
	{
		return "";
	}
}

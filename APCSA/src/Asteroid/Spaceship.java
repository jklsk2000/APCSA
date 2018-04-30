package Asteroid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Spaceship extends MovingThing
{
	private int speed;
	private Image image;

	public Spaceship()
	{
		this(0,0,0);
	}

	public Spaceship(int x, int y)
	{
		this(x,y,0);
	}

	public Spaceship(int x, int y, int s)
	{
		super(x, y);
		
		speed=s;
		
		try
		{
			image = ImageIO.read(new File("spaceship.png"));
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
		window.drawImage(image,getX(),getY(),40,55,null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
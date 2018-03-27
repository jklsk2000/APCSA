package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add the other Ball constructors
	public Ball (int x, int y){
		super(x,y);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h){
		super(x,y,w,h);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball (int x, int y, int w, int h, Color c){
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball (int x, int y, int w, int h, Color c, int xs, int ys){
		super(x,y,w,h,c);
		setXSpeed(xs);
		setYSpeed(ys);
	}
   //add the set methods
   public void setXSpeed(int xs){
	   xSpeed = xs;
   }
   public void setYSpeed(int ys){
	   ySpeed = ys;
   }

   public void moveAndDraw(Graphics window)
   {
   		//draw a white ball at old ball location
	  draw(window, Color.WHITE);
	  	//setX
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if (getX() == ((Block) obj).getX() || getY() == ((Block)obj).getY() || getWidth() == ((Block)obj).getWidth() || getHeight() == ((Block)obj).getHeight() || getColor() == ((Block)obj).getColor()){
			if (getXSpeed() == ((Ball) obj).getXSpeed() || getYSpeed() == ((Ball) obj).getYSpeed()){
				return true;
			}
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
   //add a toString() method
	public String toString(){
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
}
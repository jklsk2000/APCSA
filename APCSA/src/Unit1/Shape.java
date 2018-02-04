package Unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
 //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

 public Shape(int x, int y, int wid, int ht, Color col)
 {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		//finish this constructor
 }


 public void draw(Graphics window)
 {	 
    window.setColor(color);
    window.fillRect(xPos, yPos, width, height);
    
    window.drawLine(100, 500, 700, 500);
    //draw whatever you want
    //    ^
    //  [ :: ]
    //    ()
    
    

 }

 //BONUS
 //add in set and get methods for all instance variables

 public String toString()
 {
 	return xPos+" "+yPos+" "+width+" "+height+" "+color;
 }
}
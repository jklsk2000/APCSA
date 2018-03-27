package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block (){
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}
	public Block(int x, int y){
		xPos = x;
		yPos = y;
	}
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLACK;
	}
	public Block (int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos = y;
	}
	public void setWidth(int w){
		width = w;
	}
	public void setHeight(int h){
		height = h;
	}
	public void setColor(Color c){
		color = c;
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public Color getColor(){
		return color;
	}
	public void draw (Graphics window){
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
	}
	public String toString(){
		String output = "";
		output += getX() + " " + getY() + " " + width + " " + height + " " + color;
		return output;
	}
}
	//add other Block constructors - x , y , width, height, color
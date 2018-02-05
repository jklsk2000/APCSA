package unit2;

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;
	private int area;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = 2*length + 2*width;
	}
	
	public void area()
	{
		area = length * width;
	}

	public void print( )
	{
		System.out.println("The area is :: " + area + ".");
		System.out.println("The perimeter is :: " + perimeter + ".");
	}
}

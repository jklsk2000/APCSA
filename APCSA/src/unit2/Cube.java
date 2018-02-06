package unit2;

public class Cube {
	private int side;
	private int surfaceArea;
	
	public void setSide(int s)
	{
		side = s;
	}
	
	public void calculatesa()
	{
		surfaceArea = 6*side*side;
	}
	
	public void print ()
	{
		System.out.println("The surface area is :: " + surfaceArea);
	}
}

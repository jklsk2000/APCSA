package unit2;

public class Lab02f {
	public static void main(String[] args)
	{
		Line line = new Line(1,9,14,2);
		line.setCoordinates(1,9,14,2);
		line.calculateSlope();
		line.print();
		
		Line line2 = new Line(1,7,18,3);
		line2.setCoordinates(1,7,18,3);
		line2.calculateSlope();
		line2.print();
	}
}

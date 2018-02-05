package unit2;

public class Lab02a
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(7,6);
		test.calculatePerimeter( );
		test.area();
		test.print();
		
		System.out.println("\n");
		
		test.setLengthWidth(10,11);
		test.calculatePerimeter( );
		test.area();
		test.print();
		
		//add more test cases		
	}
}
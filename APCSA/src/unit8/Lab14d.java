package unit8;

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		int a = 5;
		String w = "100.0 90.0 85.0 72.5 95.6";

		int b = 3;
		String x = "50.0 100.0 80.0";
		String y = "93.4 -90.0 90.0";
		
		int c = 9;
		String z = "1 2 3 4 5 6 7 8 9";
		
		
		Grades g = new Grades(a,w);
		System.out.println(g.toString());
		
		Grades g1 = new Grades(b,x);
		System.out.println(g1.toString());
		
		Grades g2 = new Grades(b,y);
		System.out.println(g2.toString());
		
		Grades g3 = new Grades(c,z);
		System.out.println(g3.toString());
	}
}
package unit7;

import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	   TriangleThree t = new TriangleThree();
	   
	   t.setTriangle(3, "A");
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());
	   
	   t.setTriangle(7, "X");
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle(1, "R");
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle(5, "T");
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle(4, "W");
	   System.out.println(t.getLetter());
	   System.out.println(t.toString()); 
   }
}

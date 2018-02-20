package unit7;

import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	   TriangleThree t = new TriangleThree();
	   
	   t.setTriangle("A", 3);
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());
	   
	   t.setTriangle("X", 7);
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle("R", 1);
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle("T", 5);
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());

	   t.setTriangle("W", 4);
	   System.out.println(t.getLetter());
	   System.out.println(t.toString());
   }
}

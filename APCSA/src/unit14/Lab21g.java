package unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter

		AtCounter atat = new AtCounter();
		
		//test the code
		
		int row = 0;
		int col = 0;
		atat.countAts(row, col);
		System.out.println(row + " " + col + " " + "has " + atat.toString());
		
		row = 2;
		col = 5;
		atat.countAts(row, col);
		System.out.println(row + " " + col + " " + "has " + atat.toString());
		
		row = 5;
		col = 0;
		atat.countAts(row, col);
		System.out.println(row + " " + col + " " + "has " + atat.toString());
		
		row = 9;
		col = 9;
		atat.countAts(row, col);
		System.out.println(row + " " + col + " " + "has " + atat.toString());
		
		row = 3;
		col = 9;
		atat.countAts(row, col);
		System.out.println(row + " " + col + " " + "has " + atat.toString());
	}
}
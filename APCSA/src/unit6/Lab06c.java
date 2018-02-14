package unit6;

import static java.lang.System.*;

public class Lab06c
{
	public static void main( String args[] )
	{
		//add test cases
		ReverseNumber test = new ReverseNumber();
		test.setReverseNumber(234);
		System.out.println(test.toString());
		
		ReverseNumber test2 = new ReverseNumber();
		test2.setReverseNumber(10000);
		System.out.println(test2.toString());
		
		ReverseNumber test3 = new ReverseNumber();
		test3.setReverseNumber(111);
		System.out.println(test3.toString());
		
		ReverseNumber test4 = new ReverseNumber();
		test4.setReverseNumber(9005);
		System.out.println(test4.toString());
		
		ReverseNumber test5 = new ReverseNumber();
		test5.setReverseNumber(84645);
		System.out.println(test5.toString());
	}
}
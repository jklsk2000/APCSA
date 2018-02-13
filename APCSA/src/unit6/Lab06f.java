package unit6;

import static java.lang.System.*;

public class Lab06f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am", 's');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
	}
}

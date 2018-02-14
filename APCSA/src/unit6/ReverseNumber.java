package unit6;

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber()
	{
		number = 0;
	}
	//add a set method
	public void setReverseNumber(int n)
	{
		number = n;
	}

	public int getReverse()
	{
		int rev=0;
		int num = number;
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
	//add  a toString
	public String toString()
	{
		return number + " reversed is " + getReverse();
	}
}
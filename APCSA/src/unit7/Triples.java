package unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		num = number;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		int lim = Math.min(a, b);
		lim = Math.min(c, lim);
		
		for (int i = lim; i >= 2; i--)
		{
			if (a%i == 0 && b%i == 0 && c%i == 0)
			{
				return i;
			}
		}
		

		return 1;
	}

	public String toString()
	{
		String output="";

		
		for (int a = 0; a < number; a++)
		{
			for (int b = number; b > a; b--)
			{
				for (int c = number; c > b; c--)
				{
					if (a*a + b*b == c*c)
					{
						if ( (a%2 == 1 && b%2 == 0)||(a%2 == 0 && b%2 == 1))
						{
							if (greatestCommonFactor(a,b,c) == 1)
							output += a + " " + b + " " + c + "\n";
						}
					}
				}
			}
		}
		
		return output+"\n";
	}
}
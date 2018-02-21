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
		lim = Math.min(lim, c);
		
		for (int i = 2; i <= lim; i++)
		{
			if (a%i == 0 && b%i == 0 && c%i == 0)
			{
				i = max;
				return max;
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
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					{
						if ( (a%2 == 1 && b%2 == 0)||(a%2 == 0 && b%2 == 1))
						{
							if (greatestCommonFactor(a,b,c) == 1)
							{
								output += a + " " + b + " " + c + "\n";								
							}
						}
					}
				}
			}
		}
		
		return output;
	}
}
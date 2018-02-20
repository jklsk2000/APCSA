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

		for (a = 0; a < number; a++)
		{
			for (b = number; b > a; b--)
			{
				for (c = number; c > b; c--)
				{
					if (a*a + b*b == c*c)
					{
						out.println(a + " " + b + " " + c);
					}
				}
			}
		}

		return 1;
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}
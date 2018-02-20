package unit7;

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = " ";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		String output = "";
		
		
		for (int i = 1; i <= size; i++)
		{
			
			for (int k = i; k <= size ; k++)
		    {
		        output += " ";
		    } 
			
			for (int r = 1; r <= i; r++)
			{
				output += letter;
			}
			output += "\n";
		}
		return output;
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}

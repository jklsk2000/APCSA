package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   int len = s.length() - 1;
	   for (int i =0; i <= len; i++){
		   mat[0][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[len][i] = s.charAt(i);
		   mat[i][len-i] = s.charAt(len - i);
	   } 
	   
	}

	public String toString()
	{
		String output="";
		for (int i =0; i < mat.length; i++){
			for (int j = 0; j < mat.length; j++){
				output += mat[i][j];
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}
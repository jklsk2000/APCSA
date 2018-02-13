package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		
		out.print("Eneter a word :: ");
		String w = keyboard.next();
		
		StringOddOrEven s = new StringOddOrEven();
		s.setString(w);
		out.println(s.toString());
	}
}
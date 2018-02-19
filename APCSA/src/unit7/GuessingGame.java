package unit7;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class GuessingGame
{
	private int upperBound;
	private int response = 0;
	private int trials = 0;
	private int ran = 0;

	public GuessingGame(int stop)
	{
		stop = upperBound;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Guessing Game - How many numbers? ");
		upperBound = keyboard.nextInt();
		
		ran = (int) (Math.random() * upperBound + 1);
		
		do 
		{
			System.out.println("Enter a number between 1 and " + upperBound + ": ");
			response = keyboard.nextInt();
			
			if (response <= 0)
			{
				System.out.println("Number out of range!");

			}
			else
			{
				trials++;
			}			
		} while (response != ran);
		
		System.out.println(toString());
		
	
		
	}

	public String toString()
	{
		String output= "\nIt took " + trials + " guesses to guess " + ran + ".\nYou guessed wrong  " + ( 100.0 - (1.0/trials) * (100)) + " percent of the time.\n\n";
		return output;
	}
}
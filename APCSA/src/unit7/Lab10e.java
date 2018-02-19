package unit7;


import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		do
		{
			GuessingGame test1 = new GuessingGame(0);
			test1.playGame();
			
			System.out.println("Do you want to play again? (y/n) ");
			response = keyboard.nextLine();
			response.trim().toLowerCase();
			System.out.println("\n\n");
			
		} while (response.equals("y"));
		
	}
}
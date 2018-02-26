package unit8;

import java.util.Arrays;
import java.util.Scanner;

public class hangman {
	String [] words = {"program", "computer", "science", "java"};
	String [] ast;
	
	public hangman() {
		
	}
	
	public void hangman() {
		
	}
	
	public String makeString () {
		
		String output = "";
		for (String items : ast) {
			output += items;
		}
		
		return output;
	}
	
	public void play()
	{
		Scanner keyboard = new Scanner (System.in);
		
		ast = new String [words[0].length()];
		
		for (int i = 0; i < words[0].length(); i++){
			ast[i] = "*";
		}
		
		int count = 0;
		String guess = "";
		String finalast = "";
		
		while (finalast != words[0]) {
			
			System.out.println("(Guess) Enter a letter in word: " + makeString() + " > ");
			guess = keyboard.nextLine();
			
			int g = words[0].indexOf(guess);

			
			if (g == -1) {
				System.out.println(guess + " is not in the word.");
				count++;
			}
			
			
			for (int j = 0; j < words[0].length(); j++ )
			{
				if (g != -1) {
					ast[g] = guess;
				}
				g = words[0].lastIndexOf(guess);
			}
			System.out.println(words[0]);
			System.out.println(makeString());
			
			finalast = makeString();
			
			
			
		}

		
	}

}



package unit11LabAssessment;

import java.util.Scanner;
import java.util.ArrayList;

public class IngTester {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many ingredients? ");
		int number = keyboard.nextInt();
		keyboard.nextLine();
		
		ArrayList<String> ing = new ArrayList<String>(number);
		
		for (int i = 0; i < number; i++){
			System.out.println("Ingredient " + (i+1) + ": ");
			String food = keyboard.nextLine();
			ing.add(food);
		}
		
		Ingredients yum = new Ingredients(number, ing);
		System.out.println(yum);
	}
	
}

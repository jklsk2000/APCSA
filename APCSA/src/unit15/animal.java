package unit15;

import java.util.Scanner;

public abstract class animal {
	Scanner keyboard = new Scanner (System.in);
	public int sleep(){
		System.out.println("How many hours did the animal sleep? ");
		int num = keyboard.nextInt();
		keyboard.nextLine();
		return num;
	}
	public String food(){
		System.out.println("What did the animal eat? ");
		String food = keyboard.nextLine();
		return food;
	}
	public String toString(){
		String output = "";
		output += "The mammal had " + sleep() + " hours of sleep and ate " + food() + ".";
		return output;
	}
	
	public static void main (String[] args){
		
	}
}

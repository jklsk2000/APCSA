package unit15;

import java.util.Scanner;

public class dog extends animal{
	Scanner keyboard = new Scanner (System.in);

	public dog (){
		super();
	}
	
	public void bork(){
		System.out.println("The dog borked");
	}
	public void tail(){
		System.out.println("The dog is chasing its tail");
	}
	public static void main (String[] args){
		animal doggo = new dog ();
		System.out.println(doggo);
	}
}

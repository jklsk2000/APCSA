package unit14;

import java.util.Scanner;
import java.util.Arrays;

public class largest {
	
	private static int count = 0;
	
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int[] bop = new int[8];
		
		for (int i = 0; i < bop.length; i++){
			System.out.println("Enter a number: ");
			int numbop = keyboard.nextInt();
			bop[i] = numbop;
		} //eight number inputs from the user
		
		System.out.println("The largest number in the array is " + find(bop, Integer.MIN_VALUE));
	}
	
	
	public static int find(int[] bop, int big){
		if (count == bop.length){
			return big;
		}
		else{
			if (bop[count] > big){
				big = bop[count];
			}
			count++;
			return find(bop, big);
		}
	}
}

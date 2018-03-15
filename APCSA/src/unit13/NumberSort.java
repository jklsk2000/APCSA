package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		while (number > 0){
			number = number / 10;
			count++;
		}
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];

		int temp = 0;
		int count = 0;
		while (number > 0){
			temp = number % 10;
			number = number / 10;
			sorted[count] = temp;
			count++;
		}
		
		for (int i=0; i<sorted.length; i++){
			int min = i;
			for (int j = i + 1; j < sorted.length; j++){
				if (sorted[j] < sorted[min]){
					min = j;
				}
			}
			if (min != i){
				int filler = sorted[min];
				sorted[min] = sorted[i];
				sorted[i] = filler;
			}
		}
		
		return sorted;
	}
}
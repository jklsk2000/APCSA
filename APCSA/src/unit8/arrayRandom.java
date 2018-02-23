package unit8;

import java.util.Arrays;
import java.util.Random;



public class arrayRandom {
	
	public static void main (String [] args)
	{
		String output = "[";
		int[] a = genRan();

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(getcount(a)));
	}
	
	public static int[] genRan (){
		
		Random rand = new Random ();
		
		int [] newarray = new int [100];
		
		for (int i = 0; i < 100; i++) {
			newarray[i] = rand.nextInt(10);
		}
		return newarray;
	}	
	
	public static int[] getcount(int[] nums) {
		int[] counts = new int[10];
		
		for(int n = 0; n < 10; n++) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == n) {
					counts[n] += 1;
				}
			}
		}
		
		return counts;
	}
}



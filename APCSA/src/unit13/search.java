package unit13;

import java.util.Arrays;

public class search {
	public static void main(String[] args){
		int[] random = {56,18,78,12,33,40,82,88,87,14,75,59,96,52,93,65,60,80,11,89,50,24,3,73,39,25,9,94,37,15,76,41,54,10,81,95,43,77,7,28,70,85,90,8,71,35,53,16,13,6,67,47,72,46,97,74,92,64,30,5,61,1,32,83,23,36,66,48,42,44,20,26,55,29,4,31,49,91,99,63,38,79,68,34,100,22,98,2,84,69,45,51,58,21,17,19,62,27,57,86};
		
		System.out.println(Arrays.toString(random));
		Arrays.sort(random);
		System.out.println(Arrays.toString(random));
		
		
		
//		while(Arrays.binarySearch(numbers, key))
//		
//		long start = System.nanoTime();
//		
//		long end = System.nanoTime();
//		
//		long total = end - start;
//		
//		System.out.println("Took " + total*Math.pow(10, -9));
	} 
}
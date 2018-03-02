package unit10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNotes {
	
//	static int[] numbers = {2,3,4};
//	static Integer number = new Integer(5);
//	static int num = 8;
//	static String w = "A";
	
	static ArrayList<Integer> numList;
	
	public static void main (String[] args){
		
		numList = new ArrayList();
		
		numList.add(2);
		System.out.println(numList);
		
//		System.out.println(numbers);
//		 won't print out what you would want
		
//		String word = new String ("A");
//		can't use == with Strings
//		if(w.equals(word))
//			System.out.println("same");
//		else
//			System.out.println("not same");
//		
//		System.out.println(w);
//		System.out.println(word);
//		
//		System.out.println(numbers);
//		
//		System.out.println(number);
//		System.out.println(num);
//		
//		int[] temp = numbers;
//		temp[0] = 9;
//		System.out.println(temp);
//		System.out.println(Arrays.toString(numbers));
	}
}

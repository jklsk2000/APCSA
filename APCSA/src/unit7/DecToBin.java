package unit7;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal: ");

		int dec = input.nextInt();
		int x = dec;
		String bin = "";
		
		for(int i = 7; i >=0; i--){
			
			if(x > (int)Math.pow(2, i))
			{
				x = x - x % (int)Math.pow(2, i);
			}
			
			if(x / Math.pow(2, i)==1)
			{
				bin += "1";

			}
			
			else
			{
				bin += "0";
			}
			
			x = dec % (int)Math.pow(2, i);
			
		}
		
		System.out.println(bin);
	}

}

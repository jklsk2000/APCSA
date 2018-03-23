package unit14;

import java.util.Arrays;
import java.util.Random;

public class matrixPractice {
	public static void main (String[] args){
		countOne co = new countOne();
		System.out.println(co.toString());
		co.calculate();
	}
	
}

class countOne{
	private int[][] matrix;
	

	public countOne(){
		
		matrix = new int [6][6];
		
		Random r = new Random();
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 6; j++){
				int onezero = r.nextInt(2);
				matrix[i][j] = onezero;
			}
		}
	}
	public void calculate(){
		int ones = 0;
		int ones2 = 0;
		for (int i = 0; i < matrix.length; i++){
			ones = 0;
			for (int j = 0; j < matrix.length; j++){
				if (matrix[i][j] == 1){
					ones++;
				}
			}
			if (ones % 2 == 1){
				System.out.println("Odd at row " + (i+1));
			}
			else{
				System.out.println("Even at row " + (i+1));
			}
		}
		
		for (int i = 0; i < matrix.length; i++){
			ones2 = 0;
			for (int j = 0; j < matrix.length; j++){
				
				if (matrix[j][i] == 1){
					ones2++;
				}
			}
			if (ones2 % 2 == 1){
				System.out.println("Odd at column " + (i+1));
			}
			else{
				System.out.println("Even at column " + (i+1));
			}
		}
	}
	
	public String toString(){
		String output = "";
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++){
				output += matrix[i][j];
			}
			output += "\n";
		}
		return output;
	}
}

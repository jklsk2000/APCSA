package unit11;

import java.util.Scanner;

public class GradeTester {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		double[] grade = new double[4];
		
		for(int i = 0; i < 4; i++){
			System.out.println("Enter a grade: ");
			double x = keyboard.nextDouble();
			grade[i] = x;
		}
		Grade test = new Grade(grade);
		test.setGrade(grade);
		System.out.println("\n\n" + test);
	}
}

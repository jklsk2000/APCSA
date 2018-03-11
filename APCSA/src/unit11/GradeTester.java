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
		for(int i = 0; i < 4; i++){
			Grade test = new Grade(grade[i]);
			test.setGrade(grade[i]);
			System.out.print(test.toString());
		}
	}
}

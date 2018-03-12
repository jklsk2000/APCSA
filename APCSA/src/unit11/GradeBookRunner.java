package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		out.println("What is the name of this class? ");
		String className = keyboard.nextLine();
		
		out.println("How many students are in this class? ");
		int classSize = keyboard.nextInt();
		keyboard.nextLine();
		Class c = new Class (className, classSize);
		
		
		int count = 0;
		while (count < classSize){
			out.println("Enter the name of student " + (count + 1) + " : ");
			String stuName = keyboard.nextLine();
			
			out.println("Enter the grades for " + stuName);
			out.println("Use the format x - grades (2 - 100 100) : ");
			String grades = keyboard.nextLine();
			
			Student s = new Student (stuName, grades);
			c.addStudent(count, s);
			
			count++;
		}
		
		out.println(c);
		
		for (int i = 0; i < classSize; i++){
			out.println(String.format(c.getStudentName(i) + "\'s average = %.2f",c.getStudentAverage(i)));	
		}
			
		out.println("Failure List = " + c.getFailureList(70));	
		out.println("Highest Average = " + c.getStudentWithHighestAverage());
		out.println("Lowest Average = " + c.getStudentWithLowestAverage());
		out.println(String.format("Class Average = %.2f",c.getClassAverage()));
	}		
}
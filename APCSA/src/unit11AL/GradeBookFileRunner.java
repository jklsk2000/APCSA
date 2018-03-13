package unit11AL;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir") + "//src//unit11//gradebook.dat"));
		
		String className = file.nextLine();
		int classSize = file.nextInt();
		file.nextLine();
		Class c = new Class (className, classSize);
		
		for (int i = 0; i < classSize; i++) {
			String stuName = file.nextLine();
			String grades = file.nextLine();
			Student s = new Student (stuName, grades);
			c.addStudent(i, s);
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
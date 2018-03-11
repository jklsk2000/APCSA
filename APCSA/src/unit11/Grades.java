package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private Grade[] grade;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner glist = new Scanner(gradeList);
		int count = glist.nextInt();
		glist.next();
		for (int i = 0; i < count; i++){
			double a = glist.nextDouble();
			grade[i] = new Grade(a);
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		
	}
	
	public double getSum()
	{
		double sum=0.0;
		
		return sum;
	}
	
	public double getLowGrade()
	{
		Arrays.sort(grade);
		double low = ;
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		return high;
	}
	
	public int getNumGrades()
	{
		return grade.length;
	}
	
	public String toString()
	{
		String output="";

		return output;
	}	
}
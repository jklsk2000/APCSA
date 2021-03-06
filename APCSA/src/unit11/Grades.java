package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private Grade[] gradeList;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String values)
	{
		setGrades(values);		
	}
	
	public void setGrades(String values)
	{
		Scanner glist = new Scanner(values);
		int count = glist.nextInt();
		gradeList = new Grade[count];
		glist.next();
		for (int i = 0; i < count; i++){
			Grade a = new Grade(glist.nextDouble());
			gradeList[i] = a;
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		gradeList[spot] = new Grade(grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < gradeList.length; i++){
			sum += (gradeList[i]).getNumericGrade();
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < gradeList.length; i++){
			if(low > gradeList[i].getNumericGrade()){
				low = gradeList[i].getNumericGrade();
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < gradeList.length; i++){
			if(high < gradeList[i].getNumericGrade()){
				high = gradeList[i].getNumericGrade();
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return gradeList.length;
	}
	
	public String toString()
	{
		String output="";
		for(int i = 0; i < gradeList.length; i++){
			output += gradeList[i].getNumericGrade() + " ";
		}
		return output;
	}
}
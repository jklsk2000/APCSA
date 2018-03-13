package unit11AL;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double avg = 0;
		avg = getSum() / getNumGrades();
		return avg;
	}

	public double getAverageMinusLow()
	{
		double avg = 0;
		avg = (getSum() - getLowGrade()) / getNumGrades();
		return avg;
	}
	
	public int compareTo(Student s){
		if (getAverage() - s.getAverage() > 0){
			return 1;
		}
		else if (getAverage() - s.getAverage() == 0){
			return 0;
		}
		else{
			return -1;
		}
	}
	
	public boolean equals (Student s){
		if (getAverage() == s.getAverage()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		String output = "";
		output += getName();
		output += " - " + myGrades.toString();
		return output;
	}	
}
package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int num;
	String grd = "";
	public double [] grade;
	//constructor
	
	public Grades (int n, String g)
	{
		num = n;
		grd = g;
		grade = new double[n];
		
		int count = 0;
		Scanner keyboard = new Scanner(grd);
		while(keyboard.hasNextDouble())
		{
			grade[count] = keyboard.nextDouble();
			count++;
		}
	}


	private double getSum()
	{
		double sum=0.0;
	
		
		for (int i = 0; i < grade.length; i++)
		{
			sum += grade[i];
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / num ;
		return average;
	}


	//toString method
	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < grade.length; i++)
		{
			output += "grade " + i + ":: " + grade[i] + "\n";
		}
		output += "average = " + getAverage() + "\n\n";
		
		return output;
	}


}
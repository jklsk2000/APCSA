package unit2;

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average( )
	{
		double sum=0;
		sum = one + two;
		average = sum/2;
	}
	public void print( )
	{
		System.out.println(one + " + " + two + " has an average of " + average);
	}
}
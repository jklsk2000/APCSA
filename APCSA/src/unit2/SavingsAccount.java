package unit2;

public class SavingsAccount {
	private double interest;
	private double initialBalance = 1000;
	private double newBalance;
	
	public void setibalance(double irate) {
		interest = irate;
	}
	
	public void addInterest() 
	{
		newBalance = initialBalance + interest * (initialBalance);
	}
	
	public void print()
	{
		System.out.println("The new balance is $" + newBalance);
	}
}

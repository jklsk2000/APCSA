package unit2;

public class SavingsAccountTester {

	public static void main (String[] args) {
		SavingsAccount a = new SavingsAccount();
		a.setibalance(0.10);
		a.addInterest();
		a.print();
	}
}

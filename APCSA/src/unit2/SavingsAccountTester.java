package unit2;

public class SavingsAccountTester {

	public static void main (String[] args) {
		BankAccount a = new BankAccount();
		a.setBankAccount(1000, .10);
		a.addInterest();
		System.out.println(a.getBalance());
	}
}

package unit9;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c = new Card ("2", "hearts", 2);
		System.out.println(c.toString());
		Card d = new Card ("jack", "diamonds", 11);
		System.out.println(d.toString());
		Card e = new Card ("king", "spades", 13);
		System.out.println(e.toString());
	}
}
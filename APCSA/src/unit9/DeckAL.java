package unit9;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class DeckAL {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	//private Card[] cards = new Card[52];

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"diamonds","clubs","heart","spades"};
	private int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public DeckAL(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		this.ranks = ranks;
		this.suits = suits;
		this.values = values;
		cards = new ArrayList<Card>();
		
//		for (int i=0;i<cards.size();i++){
//			cards.add(new Card(ranks[i%13], suits[i/13], values[i%13]));
//		}
		
		for (String suit : suits){
			for (int i = 0; i < ranks.length; i++){
				Card c = new Card (ranks[i], suit, values[i]);
				cards.add(c);
			}
		}
		
		shuffle();
		size = 52;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		for(int i = cards.size() - 1; i > 0 ; i--){
			int r = (int) Math.round((Math.random()  * i));	
			Card c = cards.remove(r);
			cards.add(i, c);
//			Card[] shuffled = new Card[52];
//			shuffled[i] = cards[r];
//			cards[r] = cards[i];
//			cards[i] = shuffled[i];
		}
		
		size = 52;
		/*System.out.println("Shuffled deck: ");
		for(int i = 0; i < size; i++){
			System.out.println(cards[i]);
		}*/
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if(isEmpty()){
			return null;
		}
		else{
			return cards.get(--size);
		}
	} 

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\n\nUndealt cards: \n\n";


		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n\nDealt cards: \n\n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		

		rtn = rtn + "\n";
		return rtn;
	}
}
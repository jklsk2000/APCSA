package unit9;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board{

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};


	/**
	 * The cards on this board.
	 */
	private Card[] cards;

	/**
	 * The deck of cards being used to play the current game.
	 */
	private Deck deck;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;	
	
	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
		System.out.println("Name: Danny Lee\nPeriod 4\nDate: 3/28/2018\nComputer Number: 22");
	}

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int size = selectedCards.size();
		if (size == 2){
			return containsPairSum11(selectedCards) || doubleFaceCards(selectedCards);
		}
		if (size == 3){
			return containsJQK(selectedCards) || containsTripleSum11(selectedCards);
		}
		else{
			return false;
		}

		//return containsPairSum11(selectedCards) || containsJQK(selectedCards) || containsTripleSum11(selectedCards) || doubleFaceCards(selectedCards);
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return containsPairSum11(cardIndexes()) || containsJQK(cardIndexes()) || containsTripleSum11(cardIndexes()) || doubleFaceCards(cardIndexes());
	}


	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int size = selectedCards.size();
		
		for (int i = 0 ; i < selectedCards.size(); i ++){
			Card cardOne = cardAt(selectedCards.get(i));
			for (int j = i+1; j < selectedCards.size(); j++){
				Card cardTwo = cardAt(selectedCards.get(j));
				if (cardOne.pointValue() + cardTwo.pointValue() == 11){
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean containsTripleSum11(List<Integer> selectedCards){
		int size = selectedCards.size();
		
		for (int i = 0 ; i < selectedCards.size(); i ++){
			Card cardOne = cardAt(selectedCards.get(i));
			for (int j = i+1; j < selectedCards.size(); j++){
				Card cardTwo = cardAt(selectedCards.get(j));
				for (int k = j+1; k < selectedCards.size(); k++){
					Card cardThree = cardAt(selectedCards.get(k));
					if (cardOne.pointValue() + cardTwo.pointValue() + cardThree.pointValue() == 11){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private boolean doubleFaceCards(List<Integer> selectedCards){
		int j = 0;
		int q = 0;
		int k = 0;
		int size = selectedCards.size();

		for (int i = 0; i < size; i++){
			if (cardAt(selectedCards.get(i)).rank() == "jack"){
				j++;
			}
			if (cardAt(selectedCards.get(i)).rank() == "queen"){
				q++;
			}
			if (cardAt(selectedCards.get(i)).rank() == "king"){
				k++;
			}
		}
		
		if (j == 2 || q == 2 || k == 2){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int size = selectedCards.size();
		
		boolean j = false;
		boolean q = false;
		boolean k = false;
		
		for (int i = 0; i < size; i++){
			if (cardAt(selectedCards.get(i)).rank() == "jack"){
				j = true;
			}
			if (cardAt(selectedCards.get(i)).rank() == "queen"){
				q = true;
			}
			if (cardAt(selectedCards.get(i)).rank() == "king"){
				k = true;
			}
		}
		return ( j && q ) && k;
	}
	
	
}
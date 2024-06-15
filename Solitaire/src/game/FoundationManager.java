package game;

import java.util.ArrayList;

import Deck.Card;

/**
 * A class to generate a stack of face up cards for Solitaire.
 * @author willi
 *
 */
public class FoundationManager {
	
	//private static ArrayList<Card> stack = new ArrayList<Card>();
	
	
	
	public static boolean canStack(Card former, Card latter)
	{
		 
		boolean canStack = false;
		
		if (!isSameColor(former, latter) && isSequential(former, latter)) canStack = true;
		
		return canStack;
	}
	

	
	
	private static boolean isSameColor(Card one, Card two)
	{
		return one.getSuit().getColor().equals(two.getSuit().getColor());
	}
	
	private static boolean isSequential(Card one, Card two)
	{
		return (one.getRank().getValue() - 1) == two.getRank().getValue();
	}
}

package game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

import Deck.Card;
import Deck.Deck;

public class GameGenerator {
	
	//The deck currently in play
	private Deck deck;
	
	//The cards that are to be drawn and played
	private Stack<Card> stock;
	
	//The discard pile, only the last added card is visible
	private Stack<Card> discard;

	//The 7 piles that comprise the tableau. each starts with 1 + n cards respectively
	private Collection<Card> tab0, tab1, tab2, tab3, tab4, tab5, tab6;
	
	//The 7 piles of the main table, where cards are placed and stacked in descending order
	private Collection<Collection<Card>> tableau;
	
	//the four suited piles that are to be stacked in ascending order
	private Collection<Card> ascHeart, ascDiam, ascClubs, ascSpade;
	
	
	public GameGenerator()
	{
		deck = new Deck();
		
		stock = new Stack<Card>();
		discard = new Stack<Card>();	
		
		tableau = new ArrayList<Collection<Card>>();

		tab0 = new Stack<Card>();
		tab1 = new Stack<Card>();
		tab2 = new Stack<Card>();
		tab3 = new Stack<Card>();
		tab4 = new Stack<Card>();
		tab5 = new Stack<Card>();
		tab6 = new Stack<Card>();		

		tableau.add(tab0);
		tableau.add(tab1);
		tableau.add(tab2);
		tableau.add(tab3);
		tableau.add(tab4);
		tableau.add(tab5);
		tableau.add(tab6);
		
		ascHeart = new Stack<Card>();
		ascDiam = new Stack<Card>();
		ascClubs = new Stack<Card>();
		ascSpade = new Stack<Card>(); 

		
		
		createTableau();
		createStock();
		
		
	}
	
	/*
	 * Take the top card off the stock, set it as visible and add it to the discard pile.
	 */
	private void discard()
	{
		Card toMove = stock.pop();
		toMove.setVisible();
		discard.push(toMove);
	}
	
	/**
	 * seven piles established, 1st pile has 1 face down 1 face up, 2nd pile has 2 face down 1 face up, and so on
	 */
	private void createTableau()
	{
		int numStack = 2;
		Card toAdd = null;

		Iterator<Collection<Card>> stackIT = tableau.iterator();

		while(stackIT.hasNext())
		{
			Collection<Card> current = stackIT.next();

			for (int i = numStack; i > 0; i--)
			{
				toAdd = deck.drawCard();
				if (i > 1) toAdd.setInvisible();
				current.add(toAdd);
			}

			numStack += 1;
		}
	}
	
	private void createStock()
	{
		Card toAdd;
		while (deck.canDraw())
		{
			toAdd = deck.drawCard();
			toAdd.setInvisible();
			stock.push(toAdd);
		}
	}
	


}

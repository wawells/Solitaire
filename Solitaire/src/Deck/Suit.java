package Deck;

public enum Suit {

	CLUBS("black"),
	SPADES("black"),
	DIAMONDS("red"),
	HEARTS("red");
	
	
	private String color;

	Suit(String color) 
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return this.color;
	}

}

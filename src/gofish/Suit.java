package gofish;

public enum Suit
{
	CLUBS(1), SPADES(2), HEARTS(3), DIAMONDS(4);
	
	private int numSuit;
	
	Suit(int numSuit){
		this.numSuit = numSuit;
	}
	
	public int suitNum(){
		return numSuit;
	}
	
	
}
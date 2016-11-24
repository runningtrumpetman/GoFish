package gofish;

public class Card {
	
	public enum Rank
	{
		TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(1);
		
		private int cardNumber;
		
		Rank(int cardNumber){
			this.cardNumber = cardNumber;
		}
		
		public int rankNum(){
			return cardNumber;
		}
	
	}
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
	
	private final Rank rank; 
	private final Suit suit;
	
	private Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank(){
		return rank;
	}
	public Suit getSuit(){
		return suit;
	}
	public String toString(){
		return rank + " of " + suit;
	}
}

package gofish;

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
	
	public boolean equals(Rank r){
		return cardNumber == r.rankNum();
	}

}

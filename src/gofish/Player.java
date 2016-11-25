package gofish;
import java.util.ArrayList;

public class Player {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private String playerName = "DEFAULT Name";
	
	public Player(){}
	public Player(String name){
		playerName = name;
	}
	public Player (int number){
		playerName = "Player " + number;
	}
	public void receiveCard(Card card){
		cards.add(card);
	}
	public void loseCard(Card card){
		cards.remove(card);
	}
	
	public void asksFor(Player other, Card card){
		Rank rankToLookFor = card.getRank();
		for(Card c: other.getCards()){
			if(c.getRank().equals(rankToLookFor)){
				//if a card of the same rank is found, 
				//take the card from the other player
				other.loseCard(c);
				receiveCard(c);
				System.out.println(playerName + " took a(n) " + c + " from " + other.getName() + "!");
			}
		}
	}
	
	public String getName(){
		return playerName;
	}
	
	
	public String toString(){
		String playerString = "\tName: " + playerName + "\n\t\tHand: [";
		for(Card c: cards){
			playerString += c + ", ";
		}
		
		//check to make sure that the player has cards in his/her hand 
		if(cards.size() > 0)
		{
			//remove last comma and space
			playerString = playerString.substring(0,playerString.length()-2);
		}
		playerString += "]";
		return playerString;
	}
	public ArrayList<Card> getCards(){
		return new ArrayList<Card>(cards);
	}
}

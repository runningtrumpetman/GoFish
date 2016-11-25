package gofish;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList <Card>{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1668493922783700278L;
	private static ArrayList<Card> prototypeDeck = new ArrayList<Card>();

	public Deck(){
		shuffleDeck();
	}
	
	
	
	private void shuffleDeck(){
		Random rand = new Random();
		
		for(Rank r: Rank.values()){
			for(Suit s: Suit.values()){
				prototypeDeck.add(new Card(r,s));
			}
		}
		
		while(!prototypeDeck.isEmpty()){
			add(prototypeDeck.remove(rand.nextInt(prototypeDeck.size())));
		}
		
		
	}
	public String toString(){
		String myString = "[";
		
		for(int i=0; i<size(); i++){
			myString += this.get(i);
			if(i<size()-1)
				myString+=", ";
		}
		return myString + "]";
	}
}

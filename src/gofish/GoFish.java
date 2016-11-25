package gofish;

public class GoFish implements CardGame {

	//a new, suffled deck
	private Deck myDeck = new Deck();
	private static final int NUMPLAYERS = 4;
	private static final int STARTINGNUM = 5;
	private static Player[] players =  new Player[NUMPLAYERS];
	private Card cardToLookFor;
	private boolean playersTurn = false;
	private static Player human = new Player("Human Player");
	
	public GoFish(){
		initializePlayers();
	}
	
	public int getNumPlayers(){
		return NUMPLAYERS;
	}
	
	private static void initializePlayers(){
		players[0] = human;
		for(int i=1; i<NUMPLAYERS; i++)
			players[i] = new Player(i+1);
		
		
	}
	public void dealCards(){
		//for every player
		for(Player p : players){
			//deal out initial cards
			for(int i =0; i< STARTINGNUM; i++)
				//take from the top of the deck
				p.receiveCard(myDeck.remove(0));
		}
		playersTurn = true;
	}
	public void cardSelected(Card card) {
		if(playersTurn)
			cardToLookFor = card;
	}
	@Override
	public void playerSelected(Player p) {
		// TODO Auto-generated method stub
		//check to see if the player has selected a card to look for 
		//before asking another player
		if(cardToLookFor != null){
			
		}
		
		cardToLookFor = null;
	}

	public Player[] getPlayers(){
		return players;
	}
	
	public String toString(){
		String myString ="Game Status\n";
		myString += "=============================================================\n";
		myString += "Number of Players at Table: " + NUMPLAYERS + "\nPlayer Information:\n";
		for(Player p : players){
			myString += p + "\n";
		}

		myString += "\n=============================================================\n";
		return myString;
		
	}

	
	
}

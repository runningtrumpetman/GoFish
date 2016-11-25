package gofish;

public interface CardGame {
	
	public int getNumPlayers();
	public void dealCards();
	public void cardSelected(Card card);
	public void playerSelected(Player p);
}

package gofish;

public class CardGameController {
	private CardGame cg;
	
	public CardGameController(){
		cg = new GoFish();
	}
	
	public void startGame(){
		cg.dealCards();
	}
	
	public void printStatus(){
		System.out.println(cg);
	}
}

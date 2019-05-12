
public class Card {
	public static final String[]deck= {"H","D","S","C"};
	public static final String[]stic= {"1","2","3","4","5","6","7","8","9","T"};
	private String card;
	public Card() {
		init();
	}
	public Card(Card c) {
		card = c.getCard().trim();
	}
	public void init() {
		int a = (int)(Math.random()*deck.length);
		int b = (int)(Math.random()*stic.length);
		card=deck[a]+stic[b];
	}
	public String getCard() {
		// TODO Auto-generated method stub
		return card;
	}
	public String toString() {
		return "["+card+"]";
	}
	public boolean equals(Object obj) {
		boolean isS = false;
		Card c = (Card)obj;
		if(card.equals(c.getCard())) {
			isS=true;
		}
		return isS;
	}
	public int hashCode() {
		return card.hashCode()+137;
	}

}

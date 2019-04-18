import java.util.Random;

public class Deck extends Card {
	protected int cards_left;
	protected Card  Cards [];
	protected int number_of_cards;
	public Deck() {
		super();
		 Cards= new Card[53];
		for (int i = 1; i < 53; i++) {
			Card n = new Card(i);
			Cards[i] = n;
		}
		cards_left = 52;

	}

	public void shuffle() {
		Random rand = new Random();
		int n = rand.nextInt(52) + 1;
		int g = rand.nextInt(52) + 1;
		for (int i = 1; i < 100; i++) {
			n = rand.nextInt(52) + 1;
			g = rand.nextInt(52) + 1;
			Card j;
			j = Cards[g];
			Cards[g] = Cards[n];
			Cards[n] = j;

		}
	}
	public String toString() {
		String t = "";
		for (int i = 1; i < number_of_cards+1; i++) {
			t += Cards[i].toString();
			t += "\n";
		}
		return t;
	}
	public void Deal(Hand h, int number_of_cards) {
		for (int i = 1; i <= number_of_cards; i++) {
			h.add(Cards[0]);
			Cards[1] = Cards[cards_left];
			cards_left--;
			// Cards[d.cards_left]=null;
			if (cards_left == 0) {
				System.out.println("no cards left");
				return;
			}
			
		}

	}

}

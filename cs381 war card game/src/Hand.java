

public class Hand extends Card {
	Queue h = new Queue();
	int number_of_cards_left;

	public Hand() {
		super();
		number_of_cards_left = 0;
	}

	protected void add(Card c) {
		h.EnQ(c);
		number_of_cards_left++;
	}

	protected Card remove() {
		this.number_of_cards_left--;
		return h.DeQ();

	}
	public boolean empty(){
		return h.isEmpty();
	}

}

public class Pile extends Stack {
	Stack s;

	public Pile() {
		super();
		s = new Stack();
	}



	public void push(Card c) {
		s.push(c);
	}

	public Card pop() {
		return s.pop();
	}

	public Card peek() {
		return s.peek();
	}

	public boolean empty() {
		return s.isEmpty();
	}
}

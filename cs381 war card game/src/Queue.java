/**
 * 
 * @author Miriam Schnoll
 *
 */
public class Queue extends Object {
	private Node rear;

	public Queue() {
		rear = null;
	}

	/**
	 * method to determine if the queue is empty
	 * 
	 * @return boolean statement wheather it is empty or not
	 */
	public boolean isEmpty() {
		return rear == null;
	}

	public void EnQ(Card x) {
		if (isEmpty()) {
			
			rear = new Node(x);
			rear.next = rear;
		} else {
			rear.next.data = x;
			rear.next = rear.next;
			rear = rear.next;
		}
	}

	public Card DeQ() {
		if (isEmpty()) {
			throw new NullPointerException("Queue is empty");
		}
		Card Oldfront = rear.next.data;
		if (rear == rear.next)
			rear = null;
		else
			rear.next = rear.next.next;
		return Oldfront;
	}
}

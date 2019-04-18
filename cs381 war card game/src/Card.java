
public class Card {
	//has number value transated to cards
	private int value;
	public Card(int v) {
		if (v < 0 || v > 52)
			throw new IllegalArgumentException("invalid value");
		value = v;
	}
	public Card(){
		
	}

	public String toString() {
		String s = "";
		//value of %13 =1 so card is Ace
		if (this.value % 13 == 1)
			s += "A";
		//value of %13 11 so card is Jack
		else if (this.value % 13 == 11)
			s += "J";
		else if (this.value % 13 == 12)
			s += "Q";
		else if (this.value % 13 == 0)
			s += "K";
		else
			s += this.value%13;
		if (this.value >= 1 && this.value <= 13)
			s += " Spade";
		else if (this.value >= 14 && this.value <= 26)
			s += " Diamond";
		else if (this.value >= 27 && this.value <= 39)
			s += " Club";
		else if (this.value >= 40&&this.value<=52)
			s += " Heart";
		return s;
	}
	public int compareTo(Card c){
		int t=0;
		if(this.value%13==c.value%13)
			t= 0;
		else if(this.value%13==1)
			t= 1;
		else if(c.value%13==1)
			t= -1;
		else if(value%13>c.value%13)
			t=1;
		else if(value%13<c.value%13)
			t= -1;
		return t;
	}

}

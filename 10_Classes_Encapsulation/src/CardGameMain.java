
public class CardGameMain {

	public static void main(String[] args) {
		//should we have 52 individual cars or use 4 maps or a list of cards
		//a card has to have a suit
		//value for face cards that aren't numbers
		
		//card class that has a face value and suit
		
		Card aceOfHearts = new Card(1, "Hearts");
		System.out.println(aceOfHearts);
		aceOfHearts.flip();
		System.err.println(aceOfHearts);
	}

}

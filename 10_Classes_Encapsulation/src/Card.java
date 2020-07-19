import java.util.LinkedHashMap;
import java.util.Map;

//card class that has a face value and suit
public class Card {

	//we're going to want to print this as a string and use it as an int
		public int value; //this represents 1 forA, 2, 3, 4,...
		private static Map<Integer, String> valueMap = new LinkedHashMap<Integer, String>();
		//do we see the front or back of the card
		private boolean faceUp;
		
		private String suit; //this will be hearts, diamonds, clubs, spades
		
		public Card(int value, String suit) {
			//all cards defaults to face down
			faceUp = false;
			this.value = value;
			this.suit = suit;
		}
		
		//add to value map
		/*what behavior.methods should a card hav
		 * flip, get the color, see what it is
		 * determine if one card is greater than another (boolean for aceHigh)
		 * return result of adding two cards together
		 */
		
		public boolean flip() {
			faceUp = !faceUp;
			return faceUp;
		}
		
		@Override
		public String toString() {
			if (faceUp) {
				return value + " of " + suit;
			}
			else {
				return "Back of the card";
			}
		}
		
}

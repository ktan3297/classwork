package arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		String[] strings1 = new String[50];
		String[] strings2 = new String[5];
		String[] deck = new String[52];
		//populate array 1-50
//		populateArray(strings1);
//		printArray(strings1);
		
		//populate array with random ints
//		randomInt(strings1);
//		printArray(strings1);
		
//		rollDice(strings2);
//		printArray(strings2);
		
		deckCards(deck);
		printArray(deck);

	}
	
	private static void populateArray(String[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] = "value" + (index + 1);
		}
	}
	
	private static void randomInt(String[] b){
		for(int index = 0; index < b.length; index++){
			int x = (int) (Math.random() * 100);
			b[index] = "value" + x;
 		}
	}
	
	private static void rollDice(String[] c){ //adds total and put value into array
		for(int index = 0; index < c.length; index++){
			int x = (int) (Math.random() * 7);
			int y = (int) (Math.random() * 7);
			c[index] = "value" + (x+ y);
		}
	}
	
	private static void deckCards(String[] d){
		String[] card = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suite = {"diamond", "clubs", "hearts", "spades"};
		int i = 0;
			for(int index = 0; index < card.length; index++){
				for(int s = 0; s < suite.length; s++){
					String x = card[index] + " of " + suite[s];
					d[i] = x;
					i++;
				}
			}
	}

	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
	}

}

package datatypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;   //ARRAYS HAVE FIXED SIZE
	static String user;
	//static int lineCount;
	static boolean inLoop;
	static String response;
	
	public static void main(String[] args) {
		createAScanner();
		// lineCount = 0;
		demonstrateStringMethods();
		// promptInput();
		promptName();
		talkForever();
	}
	
	public static void promptName() {
		print("Hello, human! I am a board covered with semiconductors and other such electronic component. What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you termiante me.");
		
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + user+ ". How are you?");
			response = getInput();
			if(response.indexOf("good") <= 0)
				print("I'm so happy you're good.");
			else 
				print("I'm sorry. I don't understand you.");
		} 
	}

	public static void promptInput() {
		print(user + " Try inputting a string!");
		String userInput = input.nextLine();
		print("You typed:" + userInput);
	}

	public static void createAScanner() {
		input = new Scanner(System.in);
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String s){
		//lineCount++;
		//System.out.println("Line#"+ lineCount + ":" + s);
		//create a multi-line string
		String printString = "";
		int cutoff = 35;
		//check if there's words to add; is the length of s greater than 0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the current line and next word are less than cutoff and there are still words left to add do the following loop
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				
			nextWord = s.substring(0, endOfWord +1);
			}
			
			printString += currentLine + "\n";
		}
		
		System.out.println(printString);
		
	}
	
	public static void demonstrateStringMethods(){
		//String text1 = new String("Hello World");
				String text1 = "Hello World"; 
				String text2 = "Hello ";
				String text3 = "World";
				if(text1.equals(text2+text3))System.out.println("these strings are equal");
				System.out.println(text1);
				System.out.println(text2 + text3);
				
				String word1 = "Aardvark";
				String word2 = "Zyzzyva";
				if(word1.compareTo(word2) < 0)System.out.println("Word 1 is before word2," + " lexicongraphically");
	}
	
	// http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf
}

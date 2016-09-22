package datatypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;   //ARRAYS HAVE FIXED SIZE
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
		createAScanner();
		lineCount = 0;
		demonstrateStringMethods();
		// promptInput();
		promptName();
		talkForever();
	}
	
	public static void promptName() {
		print("Hello, human! I am a board covered with semiconductors \n and other such electronic component. \n What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you termiante me.");
		
	}

	public static void talkForever(){
		while(true){
			promptInput();
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
	
	public static void print(String s){
		lineCount++;
		System.out.println("Line#"+ lineCount + ":" + s);
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

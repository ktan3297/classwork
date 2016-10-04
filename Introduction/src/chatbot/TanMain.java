package chatbot;

import java.util.Scanner;

public class TanMain {
	static Scanner input; 
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school; //add fields 
	static Topic like;
	static Topic hello;
	static Topic sports;
	
	public static void main(String[] args) {
		createTopics();
//		String s1 = "a";
//		String s2 = " 1";
//		System.out.println(s1.compareTo(s2)); -1 means less than. period/space/num comes before a;
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
			// if(response.indexOf("good") >= 0){
			if(findKeyword(response, "good", 0) >=0){
				print("I'm so happy you're good.");
			}
			else if(like.isTriggered(response)){ // findKeyword(response, "like", 0) >= 0
				inLoop = false;
				like.talk();
			}
			else if(school.isTriggered(response)){ // findKeyword(response, "school", 0) >= 0
				inLoop = false; //exit this loop
				school.talk();
			}
			else if(hello.isTriggered(response)){
				inLoop = false;
				hello.talk();
			}
			else if(sports.isTriggered(response)){
				inLoop = false;
				sports.talk();
			}
			else{
				print("I'm sorry. I don't understand you.");
			}
		} 
	} 

	public static int findKeyword(String searchString, String key, int startIndex) {
		// delete white space at the beginning and at the end
		String phrase = searchString.trim(); //trim is a method included in the string api
		//set all letters to lowercase; gets rid of case sensitive
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
//		System.out.println("The phrase is " + phrase);
//		System.out.println("The key is " + key);
		
		//find position of key
		int psn = phrase.indexOf(key);
		
//		System.out.println("The position found is " + psn);
		
		// keep looking for the word until you find the right context; isolated word
		while(psn >= 0){
			String before = " ";
			String after = " ";
			// if the phrase does not end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
//				System.out.println("The character after " + key+ " is " + after);
			}
			// if the phrase does not being with this word
			if(psn > 0){
				before = phrase.substring(psn - 1, psn).toLowerCase();
//				System.out.println("The character before " + key + " is " + before);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
//				System.out.println(key + " was found at " + psn);
				if(noNegations(phrase, psn)){
					return psn;
				}
			}
			//incase the keyword was not found yet, check the rest of the string
			psn = phrase.indexOf(key, psn +1); //takes position and add 1
//			System.out.println(key + " was not found. Checking " + psn);
		}
		return -1; // return if cant find any key words
	}
	
	//helper method; a method that contributes functionality to another method helper methods are 
	//really common when you need to do the same thing repeatedly. also help methods to be more readable; this method
	// is private because it is only used by the method it is helping
	private static boolean noNegations(String phrase, int index){
		//check word for NO ~ 3 characters long
		//check to see if there is space for the word no to be in front of the index
		if(index - 3 >= 0 && phrase.substring(index - 3, index).equals("no ")){
			return false;
		}
		//check for not
		if(index - 4 >= 0 && phrase.substring(index - 4, index).equals("not ")){
			return false;
		}
		//check for never
		if(index - 6 >= 0 && phrase.substring(index - 6, index).equals("never ")){
			return false;
		}
		//check for n't
		if(index - 4 >= 0 && phrase.substring(index - 4, index).equals("n't ")){
			return false;
		}
		return true;
	}
	public static void promptInput() {
		print(user + " Try inputting a string!");
		String userInput = input.nextLine();
		print("You typed:" + userInput);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new TanSchool();	//extends object default constructor in the superclass
		like = new TanLike();
		hello = new TanHello();
		sports = new Sports();
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String s){
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
	
}

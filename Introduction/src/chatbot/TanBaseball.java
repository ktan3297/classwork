//kristy tan

package chatbot;

public class TanBaseball implements Topic {

	private boolean inBaseballLoop1;
	private String bResponse;
	private static String[] bQuestions = {"Who is on first base", "Who just hit a grand slam?", "Who is pitching today?", "Who is batting right now?", 
										 "Who threw the ball to 3rd base?", "Who just got banned from MLB?", "Who got a home run?", "Who struck out?", 
										 "Who is the ace pitcher?", "Who lead their team to victory in the World Series?"};
	
	public void talk() {
		inBaseballLoop1 = true;
		while(inBaseballLoop1){
			printResponse();
			bResponse = TanMain.getInput();
			isName(bResponse);
//			if(isName(bResponse)){
//				printResponse();
//				bResponse = TanMain.getInput(); 
//			}
//			
//			else if(!isTriggered(bResponse)){
//				inBaseballLoop1 = false;
//				TanMain.talkForever();
//			}
		}
	}

	private void printResponse() { 
		int responseIndex = (int)(Math.random() * bQuestions.length);
		TanMain.print(bQuestions[responseIndex]);
		
	}
	
	public void isName(String userInput){
		String[] randomAnswer = {"Correct.", "Wrong."};
		int ranIndex = (int) (Math.random() * randomAnswer.length);
		int spaces = 0;
	
		for(int s = 0; s < userInput.length(); s++){
			if(userInput.charAt(s) == ' '){
				spaces++;
			}
		}
		
		if(spaces > 2){
			TanMain.print("I do not understand, Please just give me a name.");
			bResponse = TanMain.getInput();
			isName(bResponse);
		}
		else{
			if(randomAnswer[ranIndex] == "Correct."){
				TanMain.print(randomAnswer[ranIndex] + bResponse + " did");
			}
			else{
				TanMain.print(randomAnswer[ranIndex] + bResponse + " did not.");
					}	
		}
		
	}
	
	public boolean isTriggered(String userInput) {
		if(TanMain.findKeyword(userInput, "sports", 0) >= 0){
			return true;
		}
		if(TanMain.findKeyword(userInput, "baseball", 0) >= 0){
			return true;
		}
		if(TanMain.findKeyword(userInput, "baseballs", 0) >= 0){
			return true;
		}
		if(TanMain.findKeyword(userInput, "sports", 0) >= 0){
			return true;
		}
		return false;
	}
}

package chatbot;

public class TanSchool implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolsResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			TanMain.print("Tell me about school.");
			schoolsResponse = TanMain.getInput();
			if(schoolsResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
				TanMain.talkForever(); //will stop talking about school and go back to main
			}
			TanMain.print("That's my favorite part about school too!");
		}
	}
	
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "teacher", " class"};
		// you could use a for loop
		// to iterate through an array
		if(TanMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(TanMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}
}
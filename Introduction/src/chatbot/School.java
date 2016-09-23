package chatbot;

public class School implements Topic {
	
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
}

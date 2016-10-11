package chatbot;

public class TanHello implements Topic {
	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	//responses are constants
	private static String[] calmResponses = {"We're already said our hellos. Remeber?", "Yes. Hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Seriously, this has to stop.", "You are beginning to annoy me.", "WE SAID HELLO ALREADY!"};
	
	public TanHello(){
		helloCount = 0;
	}
	 
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
				helloCount++;
				printResponse();
				helloResponse = TanMain.getInput();
				
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				TanMain.talkForever();
			}
		}
	}

	private void printResponse() { //this is a helper method. it makes the code more readable
		int responseIndex = 0;
		if(helloCount < 3 && helloCount >0){
			responseIndex = (int) (Math.random() * calmResponses.length);
			TanMain.print(calmResponses[responseIndex]);
		}
		else{
			responseIndex = (int) (Math.random() * angryResponses.length);
			TanMain.print(angryResponses[responseIndex]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(TanMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(TanMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		return false;
	}

}
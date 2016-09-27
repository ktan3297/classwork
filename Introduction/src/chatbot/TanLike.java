package chatbot;

public class TanLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() {
		TanMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = TanMain.getInput();
			int likePsn = TanMain.findKeyword(likeResponse, "like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5); // 5 because like is 4 letters and space makes 5
				TanMain.print("You are such an interesting person because you like " + thingsLiked);
				if(TanMain.findKeyword(thingsLiked, "school", 0) >=0){
					TanMain.school.talk();
				}
				else{
					inLikeLoop = false;
					TanMain.talkForever();
				}
			}
			else{
				TanMain.print("I don't understand you."); 
			}
		}
	}
}

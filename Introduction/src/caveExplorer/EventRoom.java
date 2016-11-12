package caveExplorer;

public class EventRoom extends CaveRoom {
	private Event event;
	private boolean eventOccured;
	
	public EventRoom(String description, Event event) {
		super(description);
		eventOccured = false;
		this.event = event;
	}
	
	public void enter(){
		super.enter(); // does normal stuff first 
		if(!eventOccured){
			eventOccured = true;
			event.play();
		}
	}
}

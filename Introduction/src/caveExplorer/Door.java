package caveExplorer;

public class Door {

	private boolean locked;
	private boolean open;
	private String description;
	private String details;
	
	public Door(){ //every default door is open, unlocked, passage, no detail
		locked = false;
		open = true;
		description = "passage";
		details = "";
	}
	
	public void setLock(boolean b){ //setter
		locked = b;
	}

	public boolean isLocked(){ //getter
		return locked;
	}
	
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
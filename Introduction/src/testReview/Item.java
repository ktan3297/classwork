package testReview;

public class Item {

	private String description;
	private Boolean purchased;
	
	public Item(String d) {
		this.description = d;
		this.purchased = false;
	}
	
	public void setPurchased(boolean b){
		this.purchased = b;
	}

	public boolean isPurchased() {
		// TODO Auto-generated method stub
		return purchased;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}

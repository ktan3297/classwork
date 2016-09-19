package introUnit;

public class Senior extends Student {
	
	private String internship;
	
	public Senior(String name, String internship) {
		super(name); //Student is the super
		this.internship = internship;
	}
	
	public void talk(){
		super.talk(); //call the super method
		System.out.println("...I am a senior!"); //overrides student talk method
		System.out.println("I intern as a " + internship + ".");
	}

}

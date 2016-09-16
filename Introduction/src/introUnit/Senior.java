package introUnit;

public class Senior extends Student {

	public Senior(String name) {
		super(name); //Student is the super
	}
	
	public void talk(){
		System.out.println("I am a senior!"); //overrides student talk method
	}

}

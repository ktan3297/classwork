package introUnit;

public class Junior extends Student {

	public Junior(String name) {
		super(name);
	}
	
	public void talk() {
		super.talk();
		System.out.println("...I am a junior.");
	}

}

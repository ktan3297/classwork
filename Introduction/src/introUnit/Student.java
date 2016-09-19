package introUnit;

public class Student {
	
	//fields
	private String name;
	
	//constructor (no return type. It creates students. has to be named of the class)
	public Student(String name){
		//initialize fields
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi. My name is " + this.name + ".");
	}
}

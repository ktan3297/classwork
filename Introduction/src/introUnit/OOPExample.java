package introUnit;

	/** 
	 * this class is designed to contrast with the procedural example. 
	 * It embodies as object oriented approach 
	 */

public class OOPExample {

	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian"); //student is class so its capitalized not jillian
		Student jordan = new Student("Jordan");
		Student joseph = new Student("Joseph");
		jillian.talk();
		jordan.talk();
		joseph.talk();
	}

}

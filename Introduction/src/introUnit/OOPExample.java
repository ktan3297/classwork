package introUnit;

	/** 
	 * this class is designed to contrast with the procedural example. 
	 * It embodies as object oriented approach 
	 */

public class OOPExample {

	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian", "programmer"); //student is class so its capitalized not jillian
		Student jordan = new Junior("Jordan"); //polymorphism; calling a junior a student
		Student joseph = new Freshman("Joseph");
		((Student)jillian).talk();
		jordan.talk();
		joseph.talk();
		// jillian.super.talk(); //jillian is not a type since jillian is a super but super is not jillian
		// ((Student)(jillian.super)).talk(); // you cannot cast object into its superclass
	}

}

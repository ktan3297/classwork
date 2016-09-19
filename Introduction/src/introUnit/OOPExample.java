package introUnit;

	/** 
	 * this class is designed to contrast with the procedural example. 
	 * It embodies as object oriented approach 
	 */

public class OOPExample {

	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian", "programmer"); //student is class so its capitalized not jillian
		Student jordan = new Junior("Jordan");
		Student joseph = new Freshman("Joseph");
		jillian.talk();
		jordan.talk();
		joseph.talk();
	}

}

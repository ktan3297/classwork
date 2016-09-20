package datatypes;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println(5.0/2); 
		System.out.println((double) 5/2); //casting the int into a double 
		System.out.println(5/2); //rounded down
		System.out.println(3+5.0/2+5*2);
		System.out.println((double) 3.0+5/2+5*2);
		System.out.println((int)(3.0+5)/(2+5*2));
		
		// if(42 == 42.0) System.out.println("42 == 42.0");
		
		double d1 = 4.64; 
		double d2 = 2.0; 
		double d3 = 2.64;

		System.out.println("d1 : " + d1); //since d1-3 are in quotes it will say "d1-3"
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		
		String ten = "10"; //one comes before 2 so it reports no
		String two = "2";
		if(ten.compareTo(two)>0) System.out.println("yes");
		else System.out.println("no");
		
		//1 String s = 1; // method is string but 1 is an int
		// System.out.println(s); 
		
		//2 String s = (String)1; // 1 is a int not a string
		//System.out.println(s);
		
		//3 String s = "1";
		// System.out.println(s); //it prints "1" because its in quotes
		
		//4 String s = "" + 1; // empty quotes concatentate with 1
		// System.out.println(s);
		
		//5 String s = "Happy "+ 18 + "th birthday!";
		// System.out.println(s);
		
		//6 String s = "Happy 18th birthday!"; // prints the entire string
		// System.out.println(s);
		
		//7 String s = "Happy "+ 54/3 + "th birthday!";
		// System.out.println(s);
		
		// 8 String s = "Happy "+ (54/3) + "th birthday!"; 
		// System.out.println(s);
		 
		//9 and 10
		int m = 22;
		int n = 7;
		System.out.println("m/n is " + (m/n)); // int
		System.out.println("m/n is " + ((double)m/n)); // makes it a double => decimal
		
		System.out.println(1/2); // prints "0" cuz both int so it cant have decimal
	}

}


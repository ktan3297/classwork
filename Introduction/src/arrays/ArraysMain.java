package arrays;

public class ArraysMain { // have fixed size, same types, and index
//	array is not an object and does not have any methods
	public static void main(String[] args) {
//		This is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has" + " a number equal to " + sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + "ms.");
	} 
	private static void passByValueDemo(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		int ten = 10;
		increase(ten);
		System.out.println("Ten, increased is " + ten);
//		doesn't change value it changes local variable
//		in this method, we pass the element
//		(a variable) not the array so no change will be made
		System.out.println("Before" + someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\" method" + someStrings[99]);
//		printArray(someStrings);
		changeArray(someStrings);
		System.out.println("After \"changeArray\" method" + someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.println("After \"changeArrayElement\" method" + someStrings[99]);
	}
	
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = " new item " + (i + 1);
	}

	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item" + (i + 1);
		}
	}
	//this method does nothing since local variables are destroyed after the method is complete
	private static void increase(int x) {
		x= x+1;
	
	}

	private static void changeString(String s) {
		s = "This string has been changed."; // why does this not work
	}

	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] = "value" + (index + 1);
		}
	}

	public static void arrayIntroMethod(){
//		construct 3 integer arrays
//		these two methods do the same thing
//		primitive type arrays fill with zeros 0,0.0,false
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		
//		example
		boolean[] booleans1 = new boolean[3];
		
//		iterate (2ways)
//		FIRST METHOD: WHEN TO USE THIS FOR LOOP
//		 - when index of data is important to reference
//		 - you need to customize how you iterate (example: increase by 2, go backwards, etc)
		for(int index = 0; index < booleans1.length; index++){
			System.out.println(index + ")" + booleans1[index]);
		}
		
//		SECOND METHOD: FOR EACH 
//		always go in order and does not keep track of index; easier to type
		for(boolean b: booleans1){
			System.out.println(b);
		}
		
//		these two constructors are different
		String[] strings1 = {"", "", ""};
		String[] strings2 = new String[3];

//		this loop instantiating the strings
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value" + (index + 1);
		}
		
//		this loop prints the string		
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
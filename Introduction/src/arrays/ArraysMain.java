package arrays;

public class ArraysMain {
//	array is not an object and does not have any methods
	public static void main(String[] args) {
//		This is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + "ms.");
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
		
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
package arrays;

public class SampleElement {
	//field 
	private int number;
	
	//constructor
	public SampleElement(int value){
		number = value;
	}
	
	public int getNumber(){
		return number;
	}
	
	//this value of number is stored as a field
	public void increase(){
//		int x = number;
//		x++; //reassigning the value and not changing the number so in arrayMain, it will print 10 and not 11 
		number++; // this will make it print 11
	}
	
}

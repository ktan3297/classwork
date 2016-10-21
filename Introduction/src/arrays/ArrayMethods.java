package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,9,11,12,15};
		swap(arr,0,arr.length-1);
		shuffle(arr);
		printArray(arr); 
//		if(checkHalfWay(arr, 12, 0, arr.length - 1)){
//			System.out.println("The number you are searching for is less than the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the aray");
//		}
	}
	private static void printArray(int[] a) {
		for(int s: a){
			System.out.println(s);
		}
	}
	
	private static void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int random = (int)(Math.random()*6);
			swap(arr,i,random);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int placeHolder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeHolder;
	}

	/**
	 * returns true if searchValue is less than element halfway between beginning and end 
	 * @param arr to be searched
	 * @param searchValue
	 * @param beginning
	 * @param end
	 */
	//hw: keep asking the question til u get to the last number
	private static boolean checkHalfWay(int[] arr, int searchValue, int beginning, int end) {
		return searchValue < arr[(beginning + end) /2];
	}
}

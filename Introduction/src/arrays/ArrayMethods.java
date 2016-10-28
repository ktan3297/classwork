package arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,9,11,12,15};
		int[] randArr = new int[5];
//		 populateArray2(arr, randArr); // need to fix 
//		System.out.println(Arrays.toString(randArr));
//		swap(arr,0,arr.length-1);
//		shuffle(arr);
//		cycleThrough(arr, 2);
//		printArray(arr); 
//		if(checkHalfWay(arr, 12, 0, arr.length - 1)){
//			System.out.println("The number you are searching for is less than the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the aray");
//		}
		testPrimes(50);
	}
	
	private static void testPrimes(int num2Test) {
		int lastToCheck = (int) (Math.sqrt(num2Test));
		boolean[] theNumbers = new boolean[num2Test];
		for(int i = 0; i < num2Test; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			//when checking 50 numbers, it tests 2,3,4,5,6,7 as if prime
			if(theNumbers[prime]){
				//only checks numbers that are prime; numbers that are not crossed off
				//it wont check off 4 and 6 becuz it is crossed off by 2
				System.out.print("\n" + prime + " is prime. Crossing off:");
				boolean first = true;
				for(int test = prime + prime; test < num2Test; test = test + prime){
					System.out.print(test + ", ");
					theNumbers[test] = false;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i + " is prime.");
			}
		}
	}

	private static void populateArray2(int[] arr, int[]randArr){	
		// let randArr.length < arr.length
		// populate randArr with elements from arr and no repeats
		int count = 0;
		for(int i = 0; i < randArr.length; i++){
			int x = (int) (Math.random() * arr.length);
			for(int s = 0; s < randArr.length; s++){
				if(arr[x] == randArr[s]){
					count++;
				}
				else if(s == randArr.length - 1 && count == 0){
					randArr[i] = arr[x];
					count = 0;
				}
			}
		}
	}
	private static void cycleThrough(int[] arr, int n){
		for(int i = 0; i < n; i++){
			for(int s = 0; s < arr.length; s++){
				if(s != arr.length)	
				swap(arr, i, i+1);
				
			}
		}
	}
	//start at first index and swap it with the one after it. 
	//swap first and the last then (0,1) (1,2) (2,3)(2,4)
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

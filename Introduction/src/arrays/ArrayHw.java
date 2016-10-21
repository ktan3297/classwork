package arrays;

import java.lang.reflect.Array;

public class ArrayHw {

	public static void main(String[] args) {
    	int[] nums0 = {1,4,8,2,0,8,9};
    	int[] num1 = {1,3,5,4,1};
    	int[] num2 = {0,1,3,5,1,5};
    	int[] consec = {1,2,3,4,5,6,3,2,1,8,9,10,2,11,12,13,14,16};
    	int[] isitSorted = {6,10,9,6,8,7,6};
    	double [] stat1 = {0,1,2,-10,6,3,4};
    	//THESE ARE THE ONES THAT WORK AND ARE FINSIHED
//    	reverseOrder(nums0);
//    	printArray(nums0);
//    	System.out.println("");
//    	countDifferences(num1, num2);
//    	longestConsecutiveSequence(consec);   	
//    	searchUnsorted(num2, 2);
    	
    	//continue
//    	getStats(stat1);
//    	isSorted(isitSorted); 	
//    	generateDistinctItemsList(3);
//    	int maxNum = 3;
//    	int x = (int) (Math.random() * (maxNum+1) + maxNum); //3-6
//    	System.out.println(x);
    }
	
	public static void printArray(int[] a) {
		for(int s: a){
			System.out.println(s);
		}
	}
     
    public static void reverseOrder(int[] array){
    	for(int i = 0; i < array.length /2; i++){		//start from the first and the last and worth your way to the middle of the array
        	int x = array[i];							
       		int y = array[array.length - (i +1)];		
       		array[i] = y;								
       		array[array.length - (i +1)] = x;
   		}	
    }
        
        
        public static double[] getStats(double[] array){
            /** 
             * This method return a double[] contain a WHOLE BUNCH of stats
             * The double array must keep the following stats about the array parameter:
             * index 0 = the mean
             * index 1 = the max
             * index 2 = the min
             * index 3 = the median
             * index 4 = the number of values greater than or equal to the mean
             * index 5 = the number of values below the mean
             * */
            double[] stats = new double[6];
            //find the mean
            double z = 0;
            for(int i = 0; i < array.length; i++){
            	 z = z + array[i];						
            	 if(i == array.length - 1){
            		 double mean = z/array.length;
            		 stats[0] = mean;
            		 System.out.println(stats[0]);
            		 
            		 //find the # of values greater than or equal to the mean && below average
            		 int totalGreater = 0;
            		 int totalBelow = 0;
            		 for(int s = 0; s < array.length; s++){
            			 if(array[s] >= mean){
            				 totalGreater++; //adds if number in array is >= than the mean
            			 }
            			 else{
            				 totalBelow++; //adds if number in array is < the mea
            			 }
            			 if(s == array.length - 1){
            				 stats[4] = totalGreater;
            				 stats[5] = totalBelow;
            				 System.out.println(stats[4]);
            				 System.out.println(stats[5]);
            			 }
            		 }
            	 }
             }
            
            //find the max and max
            double currentMax = 0;
            double currentMin = 0;
            for(int i = 0; i < array.length; i++){
            	if(array[i] > currentMax){ //if the number is greater than the current max value, it will become the new max value
            		currentMax = array[i];
            	}
            	if(array[i] <= currentMin){ //if the number is less than or equal to the current min value, it will become the new min value
            		currentMin = array[i];
            	}
            	
            	if(i == array.length - 1){
            		stats[1] = currentMax;
            		stats[2] = currentMin;
            		System.out.println(stats[1]);
            		System.out.println(stats[2]);
            	}
            }
            
            //FIND THE MEDIAN
            //first need to sort the array in order then find the median
//            for(int i = 0; i < array.length; i++){
//            	if(array[i] > array[i + 1]){
//            	
//            	}
//            }
             return stats;
        }
        
        public static int countDifferences(int[] array1, int[] array2){
            /**Here, you will write an method that returns the number of values in two arrays 
             * that are NOT the same (either in value OR location).
             * The arrays ALWAYS have the same length
             * Examples:
             * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
             * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
             * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
             * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
             * 
             * */
        	int countDiff = 0;
        	for(int i = 0; i < array1.length; i++){ 
        		if(array1[i] != array2[i]){ //if the index in both arrays do not have the same values, the count increases
        			countDiff++;
        		}
        		if(i == array1.length - 1){ // when end of the loop, print and return the count differences
    				System.out.println(countDiff);
    				return countDiff;
    			}
        	}
           return 0;
        }
        

        public static int longestConsecutiveSequence(int[] array1){
            /**This method counts the longest consecutive sequence in an array.
             * It does not matter where the sequence begins
             * If there are no consecutive numbers, the method should return '1'
             * 
             * Examples:
             * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
             * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
             * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
             * */
     
        	int sequenceCount = 1;
        	int newSequence = 1;
            for(int i = 0; i < array1.length; i++){
            	if(i != array1.length - 1 && array1[i + 1] == array1[i] + 1){  //if i is not the last item and the arr[i+1] is 1 greater than arr[i];
            		sequenceCount++;  
            	}
            	else if(sequenceCount > newSequence){ //when arr[i+1] no longer equals arr[i] +1 if the consec sequence is greater than the previous consec sequence, newSequence is the max consec
            			newSequence = sequenceCount;
            			sequenceCount = 1; 
            	}
            	
            	if(i == array1.length - 1){ // when u reach the end of the loop, print and return newSequence
            		System.out.println(newSequence);
    				return newSequence;
    			}
            }
            return 1;
        }

        public static int longestSharedSequence(int[] array1, int[] array2){
            /**This method counts the longest unbroken, shared sequence in TWO arrays.
             * The sequence does NOT have to be a consecutive sequence
             * It does NOT matter where the sequence begins, the arrays might not be the same length
             * 
             * Examples:
             * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
             * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
             *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
             * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
             * */
            
            return 0;
        }
        
        public static int searchUnsorted(int[] arrayToSearch, int key){
            /**
             * this method take an unsorted int array (arrayToSearch) and returns an 
             * int corresponding to the index of a key, if it is in the array
             * if the key is not in the array, this method returns -1
             * */
        	for(int i = 0; i < arrayToSearch.length; i++){
        		if(arrayToSearch[i] == key){
        			System.out.println(i);
        			return i;
        		}
        	}
        	System.out.println("-1");
            return -1;
            }
            
            public static int searchSorted(int[] sortedArrayToSearch, int key){
            /**
             * this method is exactly like the one above, except the parameter sortedArrayToSearch will
             * always be sorted in DESCENDING order. Again return the index of the key or return -1
             * if the key is not in the array
             * 
             * Note: You should attempt to write a method that is more efficient that searchUnsorted
             * */
             return -1;
            }
            
            public static boolean isSorted(int[] array){
                /**
                 * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
                 * */
            	// NEEDS TO BE FIXED
            	int count1 = 0;
            	for(int i = 0; i < array.length; i++){
            		if(array[i + 1] != array[i] - 1){
            			count1++;
            		}
            		if(i == array.length -1 && count1 == 0){
            			System.out.println("true");
            			return true;
            		}
            	}
                return false;
            }

        public static int[] generateDistinctItemsList(int n){
            /**
             * This method needs to generate an int[] of length n that contains distinct, random integers
             * between 1 and 2n 
             * The method will be tested by verifying that the array you return is n items long,
             * contains only entries between 1 and 2n (inclusive) and has no duplicates
             * 
             * */
        	int[] array1 = new int[n];
        	int maxNum = 2 * n;
    //    	int minNum = n;
        	for(int i = 0; i < n; i++){
        		int x = (int) (Math.random() * (maxNum + 1) + n);
        		int check = 0;
        		for(int s = 0; i < n; i++){
        			if(array1[s] == x){
        				check++;
        			}
        			if(check == 0 && s == n - 1){
        				array1[i] = x;
        			}
        			else if(check != 0 && s == n - 1){
        				i  = i - 1;
        			}
        		}
        		if(i == n - 1){
        			System.out.println("!");
        			return array1;
        		}
        	}
            return null; 
        }
        
        
        public static void cycleThrough(int[] array, int n){
            /** This problem represents people moving through a line.
             * Once they get to the front of the line, they get what they've been waiting for, then they 
             * immediately go to the end of the line and "cycle through" again.
             * 
             * This method reorders the array so that it represents what the array would look like
             * after it had been cycled through an n number of times.
             * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
             * because '2' (the person at the front of the line) cycled through and is now at the end of the line
             * 
             * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
             * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
             * 
             * Likewise,
             * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
             * and the most interesting case, 
             * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
             * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
             * was able to go through one more time than anyone else
             * 
             * CHALLENGE
             * For extra credit, make your method handle NEGATIVE n
             * */
        }
}



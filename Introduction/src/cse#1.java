package question1;

public class One {
	
	public static void main(String[] args){
		
		int[] array1 = {9,1,1,0,0,0,0};
		int[] array2 = {8,14,3,2,2,7,8};
		System.out.println(partA(array1, 21));
		System.out.println(partB(array2, 11));
	}
	//(2n * 3n * 1) + 1 Number of operations in terms of n
	public static String partA(int[] data1, int sum1){
		for(int i = 0; i < data1.length; i++){ //2n
			for(int j = i+1; j < data1.length; j++){ //3n
				if(data1[i] + data1[j] == sum1){ //2
					return data1[i] + " + " + data1[j] + " = " + sum1 + ", true";//1
				}
			}	
		}
		return "false";//1
	}
	
	//need to fix this: partB(array1, 11) should print 2+2+7 but it prints 1+7+3
	//it does not print the first possible combination 
	public static String partB(int[] data2, int sum2){
		for(int i = 0; i < data2.length; i++){
			for(int j = i+1; j < data2.length; j++){
				for(int k = j+1; k < data2.length; k++){
					if(data2[i] + data2[j] + data2[k] == sum2){
						return data2[i] + " + " + data2[j] + " + " + data2[k] + " = " + sum2
								+ ", true";
					}
				}
			}
		}
		return "false";
	}
}

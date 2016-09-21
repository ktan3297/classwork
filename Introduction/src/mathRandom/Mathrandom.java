package mathRandom;

import java.util.Random;

public class Mathrandom {

	public static Random genNum = new Random();
	public static int ranNum = genNum.nextInt(6) + 1;
	
	public static void main(String[] args) {
		int[] results = new int[6]; // same as int[] results ={0,0,0,0,0,0};
		int totalRolls = 10000;
		
		for(int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie();
			int roll2 = rollFairDie();
			if(index % 2 == 0){
				System.out.println("Roll #" + (index + 1) + " Die is " + roll);
				results[roll-1]++;
			}
			else{
				System.out.println("Roll #" + (index + 1) + " Die is " + roll2);
				results[roll - 1]++;
			}
		}
		
		for(int i = 0; i < 6; i++){
			int percentage = (int) (100 * ((double)results[i]/totalRolls)); // multiply by 1000 and divide by 10.0
			System.out.println((i + 1) + " was rolled " + percentage  + " %.");
		}
		
	}
	
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6) + 1; //nextInt = max of 5
		
//		double rand = Math.random(); // random double (0,1) exclusive
//		int roll = (int) (6 * rand); //max = [0,5] since int rounds down
//		return roll + 1; // because 0 becomes 1 and 5 becomes 6
	}
	 
	public static int rollUnfairDie(){
		return ranNum;
	}
			
}


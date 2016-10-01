package mathRandom;

import java.util.Random;

public class Mathrandom {

	public static Random genNum = new Random();
	public static int ranNum = genNum.nextInt(6) + 1;	//generate random number 1-6
	
	public static void main(String[] args) {
		int[] results = new int[6]; // same as int[] results ={0,0,0,0,0,0};
		int totalRolls = 10000;		//Number of times to roll
		
		for(int currentRoll = 0; currentRoll < totalRolls; currentRoll++){
			int roll = rollUnfairDie();
			int roll2 = rollFairDie();
			if(currentRoll % 2 == 0){	//If odd give same number
				results[roll-1]++;
				System.out.println("Roll #" + (currentRoll + 1) + " Die is " + roll);
				// roll-1 because ranNum is 1-6 and indicies are 0-5
			}
			else{	//If even give new number
				results[roll2 - 1]++;
				System.out.println("Roll #" + (currentRoll + 1) + " Die is " + roll2);
			}
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println("Total rolls for " + (i+1) + ": "+ results[i]);
			int percentage = (int) (100 * ((double)results[i]/totalRolls)); // multiply by 1000 and divide by 10.0
			System.out.println((i + 1) + " was rolled " + percentage  + " %.");
		}
		
	}
	//Create a new random number
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6) + 1; //nextInt = max of 5
		
//		double rand = Math.random(); // random double (0,1) exclusive
//		int roll = (int) (6 * rand); //max = [0,5] since int rounds down
//		return roll + 1; // because 0 becomes 1 and 5 becomes 6
	}
	 
	//Return same number on instantiation of Mathrandom class
	public static int rollUnfairDie(){
		return ranNum;
	}
			
}


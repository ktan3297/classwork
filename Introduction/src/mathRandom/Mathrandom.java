package mathRandom;

import java.util.Random;

public class Mathrandom {

	public static void main(String[] args) {
		for(int index = 0; index < 10; index++){
			System.out.println("Roll #" + (index + 1) + " Die is " + rollFairDie());
		}
	}
	
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6) + 1;
	}
	
	// public static int rollUnfairDie(){
		// roll certain number more than others
	//}
			
}

package mathRandom;

import java.util.Random;

public class Mathrandom {

	static Random genNum = new Random();
	static int ranNum = genNum.nextInt(6) + 1;
	
	public static void main(String[] args) {
		for(int index = 0; index < 10; index++){
			if(index % 2 == 0)
			System.out.println("Roll #" + (index + 1) + " Die is " + rollUnfairDie());
			else System.out.println("Roll #" + (index + 1) + " Die is " + rollFairDie());
		}
	}
	
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6) + 1;
	}
	
	public static int rollUnfairDie(){
		return ranNum;
	}
			
}

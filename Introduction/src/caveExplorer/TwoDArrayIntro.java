package caveExplorer;

import java.util.Scanner;

public class TwoDArrayIntro {
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {
		arr2D = new String[5][4];
		pic = new String[5][4];
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[0].length; col++){
				arr2D[row][col] = "(" + row + "," + col + ")";
			}
		}
		
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[0].length; col++){
				pic[row][col] = "0";
			}
		}
		
		i = 2;	//row
		j = 3;	//col
		in = new Scanner(System.in);
		startExploring();
	}
	
	private static void startExploring() {
		while(true){
			pic[i][j] = "X";
			printPic(pic);
			System.out.println("You  are in room " + arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w", "a", "s", "d"};
		for(String key: keys){
			if(key.equals(lc)){
				return true;
			}
		}
		return false;
	}
	
	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		pic[i][j] = "0";
		
		if(input.equals("w") && i > 0){
			i--;
		}
		else if(input.equals("a") && j > 0){
			j--;
		}
		else if(input.equals("s") && i + 1 < arr2D.length){
			i++;
		}
		else if(input.equals("d") && j + 1 < arr2D[0].length){
			j++;
		}
		
		if(iOrig == i && jOrig == j){
			System.out.println("You are at the edge of the universe. You can move no further in that direction.");
		}
		
		pic[i][j] = "X";
	}
	
	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}
}

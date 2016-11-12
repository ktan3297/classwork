package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom[][] caves;
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	public static String[][] caveMap;
	 
	public static void main(String[] args) {
		in = new Scanner(System.in);
		caves = new CaveRoom[5][5];
		
		for(int row = 0; row < caves.length; row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This cave has coordiantes " + "(" + row + "," + col + ")");
			}
		}
		
		caves[0][2] = new EventRoom("This is the room where that guy with a tail met you.", new GameStartEvent());
		currentRoom = caves[0][1];
		currentRoom.enter(); //enter will set contents of caveroom to an x
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door()); //shared programming protocol
		caves[0][2].setConnection(CaveRoom.SOUTH, caves[1][2], new Door()); 
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door()); 
		
		inventory = new Inventory();
		startExploring();
	}

	public static void startExploring() { // one does input the other does AI
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}

	public static void print(String string) {
		System.out.println(string);
		
	}

}

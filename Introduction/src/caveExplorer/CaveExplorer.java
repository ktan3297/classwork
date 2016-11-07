package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom[][] caves;
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static String[][] caveMap;
	 
	public static void main(String[] args) {
		caves = new CaveRoom[5][5];
		
		caveMap = new String[3][4];
		createMap(caveMap);
		printPic(caveMap);
		
		for(int row = 0; row < caves.length; row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This cave has coordiantes " + "(" + row + "," + col + ")");
			}
		}
		
		currentRoom = caves[0][1];
		currentRoom.enter(); //enter will set contents of caveroom to an x
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door()); //shared programming protocol
		caves[0][2].setConnection(CaveRoom.SOUTH, caves[1][2], new Door()); 
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door()); 
//		startExploring();
		
		
		
	}

	private static void startExploring() { // one does input the other does AI
		while(true){
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
		
	}
	
	public static void createMap(String[][] map){ // every other row is |; 3 per box
//		for(int row = 0; row < map.length; row++){
//			for(int col = 0; col < map[row].length ; col++){
//				if(col == map[row].length -1){
//					map[row][col] = "|___|";
//				}
//				else
//				map[row][col] = "|___";
//			}
//			
//		}
		for(int row = 0; row < map.length; row++){
			for(int col = 0; col < map[row].length ; col++){
				if(col == 0){
					
					map[row][col] = "|___|";
				}
				else{
					map[row][col] = "___|";
				}
			}
			
		}
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

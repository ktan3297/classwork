package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		boolean[][] mines = new boolean[6][6];
		createMines(mines, 10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
	}

	private static void createMines(boolean[][] mines, int numOfMines) {
		while(numOfMines > 0){
			int row = (int) (Math.random() * mines.length);
			int col = (int) (Math.random()* mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numOfMines--;
			}
		}
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}
				else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		// r and c represent coordinates of element we are providing a string for
		int count = 0;
		//loop through row above to row below
		for(int row = r - 1; row <= r + 1; row++){
			//loop through col left to col right 
			for(int col = c - 1; col < c + 1; col++){
				//exclude this element when counting 
				if(row != r && col != c){
					if(row >= 0 && row <= mines.length && col >= 0 && col < mines[row].length){
						
					}
				}
			}
		}
		return null;
	}

	public static void picDrawing(){
//		int[] arr = {0,1,2,3,4,5,6,7};
		//	System.out.println(Arrays.toString(arr));
			
			//rows, columns
			//rows =4 = arr2D.length
			//columns = 3 = arr2D[i].length
			String[][] pic = new String[10][12];
			
			//iterate row by row:
//			for(int row = 0; row < arr2D.length; row++){
//				//in each row, go col by col
//				for(int col = 0; col < arr2D[row].length; col++){
//				//	arr2D[row][col] = "(" + row + "," + col + ")";
//					arr2D[row][col] = row + ""+ col;
//				}
//			}
//			//print each row
//			for(String[] row: arr2D){
//				System.out.println(Arrays.toString(row));
//			}
			for(int row = 0; row < pic.length; row++){
				for(int col = 0; col < pic[row].length; col++){
					pic[row][col] = ".";
				}
			}
			
			for(int row = 7; row < pic.length; row++){
				for(int col = 0; col < pic[row].length; col++){
					pic[row][col] = "M";
				}
			}
			 pic[3][5] = "O";
			 pic[2][5] = "|";
			 pic[4][5] = "|";
			 pic[2][6] = "/";
			 pic[4][4] = "/";
			 pic[3][4] = "-";
			 pic[3][3] = "-";
			 pic[3][7] = "-";
			 pic[3][6] = "-";
			 pic[2][4] = "\\";
			 pic[4][6] = "\\";
			 
			 //top and bottom row is underscores
			 for(int col = 0; col < pic[0].length; col++){
				 pic[0][col] = "_";
				 pic[pic.length -1][col] = "_";
			 }
			 
			 for(int row = 1; row < pic.length; row++){
				 pic[row][0] = "|";
				 pic[row][pic[0].length -1] = "|";
			 }
			 
//			 for(int i = 0; i < 5; i++){ //random birds
//				 int x = (int) (Math.random()*pic.length);
//				 for(int s = 0; s < pic[i].length; s++){
//					 int y = (int) (Math.random()*pic[i].length);
//					 if(y != 8 && y != 7 && y != 0 && pic[x][y] == "." &&  pic[x][y - 1] == "." &&  pic[x][y + 1] == "."){
//						 pic[x][y] = "v";
//						 pic[x][y - 1 ] = "o";
//						 pic[x][y +1] = "o";
//					 }
//				 }
//			 }
			 
			printPic(pic);
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

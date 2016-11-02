package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
	//	int[] arr = {0,1,2,3,4,5,6,7};
	//	System.out.println(Arrays.toString(arr));
		
		//rows, columns
		//rows =4 = arr2D.length
		//columns = 3 = arr2D[i].length
		String[][] pic = new String[10][12];
		
		//iterate row by row:
//		for(int row = 0; row < arr2D.length; row++){
//			//in each row, go col by col
//			for(int col = 0; col < arr2D[row].length; col++){
//			//	arr2D[row][col] = "(" + row + "," + col + ")";
//				arr2D[row][col] = row + ""+ col;
//			}
//		}
//		//print each row
//		for(String[] row: arr2D){
//			System.out.println(Arrays.toString(row));
//		}
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
		 
//		 for(int i = 0; i < 5; i++){
//			 int x = (int) (Math.random()*pic.length);
//			 for(int s = 0; s < pic[i].length; s++){
//				 int y = (int) (Math.random()*pic[i].length);
//				 if(y != 8 && y != 7 && y != 0 && pic[x][y] == "." &&  pic[x][y - 1] == "." &&  pic[x][y + 1] == "."){
//					 pic[x][y] = "v";
//					 pic[x][y - 1 ] = "o";
//					 pic[x][y +1] = "o";
//				 }
//			 }
//		 }
		 
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

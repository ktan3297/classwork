package testReview;

public class twoDArray { //2D arrays: Lights Out
	
	private static boolean[][] grid;
	
	public static void main(String[]args){
		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
	}
	
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < grid.length){ //not on rubric
			switchRow(grid[r], c);
		}
		switchColumn(grid, r, c); //one point
		//check if any lights are on; you win if all lights are off
		boolean win = true;
		A: for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j]){//1 of 2 points
					win = false;
					break A;
				}
			}
		}
		if(win){
			System.out.println("You have solved the puzzle.");
		}
	}
	
	public static void switchRow(boolean[] row, int x){
		if(x <= 0 && x < row.length){
			for(int i = -1; i < 2; i++){
				if(x + i >= 0 && x + i < row.length){
					row[x + i] = !row[x + i];
				}
			}
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(grid, r - 1, c);
		switchIfValid(grid, r + 1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}

	public static void printGrid(boolean[][] arr1){
//	can also use for each loop if you don't need to keep track of the index
//		for(boolean[] row: grid){
//			for(boolean b: row){
//				if(b)System.out.print("O");
//				else System.out.print("X");
//			}
//		}
		for(int i = 0; i < arr1.length; i++){
			for(int s = 0; s< arr1[i].length; s++){
				if(arr1[i][s]){
					System.out.print("O");
				}
				else{
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
		System.out.println("--------");
	}

}

package arrays;

public class Mines {

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
		int count = 0; //count number of mines
		//loop through row above to row below
//		for(int row = r - 1; row <= r + 1; row++){
//			//loop through col left to col right 
//			for(int col = c - 1; col < c + 1; col++){
//				//exclude this element when counting 
//				if(row != r && col != c){
//					if(row >= 0 && row <= mines.length && col >= 0 && col < mines[row].length){ //check for array out of bounds error 
//						//checks only 9 times if its 8x10
//					}
//				}
//			}
//		}
		
		//this methods only checks elements in the 2d array
		//so it is not necessary to verify they are valid
		for(int row = 0; row < mines.length; row++){
			for(int col = 0; col < mines[row].length; col++){
				//check taxi cab distance							//check if true
				if(Math.abs(row - r) + (Math.abs(col - c)) == 1 && mines[row][col]){ //checks every element 80times; slower
					count++;
				}
			} 
		}
		
		//this method is helpful when you want to be very specific 
		//above
		count += validAndTrue(mines, r - 1, c);
		//below
		count += validAndTrue(mines, r + 1, c);
		//righy
		count += validAndTrue(mines, r, c + 1);
		//left
		count += validAndTrue(mines, r, c - 1);
		
		return count + "";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		//checks valid														//checks true after checking validity 
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[i].length && mines[i][j]){
			return 1;
		}
		return 0;
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

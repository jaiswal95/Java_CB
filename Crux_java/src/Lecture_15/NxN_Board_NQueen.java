package Lecture_15;

public class NxN_Board_NQueen {
	
	public static void main(String[] args) {
		NQueen(new boolean[4][4], 0, "");
	}
	static int count =0;
	public static void NQueen(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.println(++count + ". " + ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueen(board, row + 1, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}

	}
	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// Vertically Up

		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		
		// Horizontal left
		 r = row ;
		 c = col-1;

		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}
		

		// Diagonal Left

		r = row - 1;
		c = col - 1;

		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// Diagonal Right

		r = row - 1;
		c = col + 1;

		while (c <board[0].length && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}


}

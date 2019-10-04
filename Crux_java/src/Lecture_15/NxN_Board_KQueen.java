package Lecture_15;

public class NxN_Board_KQueen {

	public static void main(String[] args) {
		KQueen(new boolean[4][4], 0, "", 0, 3);

	}

	static int count = 0;

	public static void KQueen(boolean[][] board, int row, String ans, int qpsf, int tq) {

		if (qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (isitSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				KQueen(board, row + 1, ans + "{" + row + "-" + col + "}", qpsf + 1, tq);
				board[row][col] = false;
			}
		}

		KQueen(board, row + 1, ans, qpsf, tq);

	}
	
	public static boolean isitSafeToPlaceQueen(boolean[][] board, int row, int col) {

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

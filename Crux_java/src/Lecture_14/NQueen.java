package Lecture_14;

public class NQueen {

	public static void main(String[] args) {
		
		QCrec(new boolean[4][4], 0, 0, 4, 0, "");
	}

	public static void QCrec(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		// Base Place
		if (qpsf == tq) {
			System.out.println(ans);
			return;

		}
		if (col == board[0].length) {
			QCrec(board, row + 1, 0, tq, qpsf, ans);
			return;
		}
		if (row == board.length) {
			return;
		}

		// Place
		if (isitsafetoplaceQueen(board, row, col)) {
			board[row][col] = true;
			QCrec(board, row ,col+1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		// Not Place
		QCrec(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isitsafetoplaceQueen(boolean[][] board, int row, int col) {

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

package Lecture_14;

public class QueenCombinationBoxRespect2DandRecCall {

	public static void main(String[] args) {
		//QC(new boolean[2][3], 0, 0, 2, 0, "");
		QCrec(new boolean[2][3], 0, 0, 2, 0, "");
	}

	public static void QC(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		// Base Place
		if (qpsf == tq) {
			System.out.println(ans);
			return;

		}
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}

		// Place
		board[row][col] = true;
		QC(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
		board[row][col] = false;

		// Not Place
		QC(board, row, col + 1, tq, qpsf, ans);

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
		board[row][col] = true;
		QCrec(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
		board[row][col] = false;

		// Not Place
		QCrec(board, row, col + 1, tq, qpsf, ans);

	}

}

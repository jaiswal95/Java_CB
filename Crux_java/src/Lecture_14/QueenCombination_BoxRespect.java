package Lecture_14;

public class QueenCombination_BoxRespect {
	public static void main(String[] args) {
		QC(new boolean[4], 0, 2, 0, "");

	}

	public static void QC(boolean[] board, int col, int tq, int qpsf, String ans) {

		// Base Place
		if (qpsf == tq) {
			System.out.println(ans);
			return;

		}
		if (col == board.length) {
			return;
		}

		// Place
		board[col] = true;
		QC(board, col + 1, tq, qpsf + 1, ans + "b" + col + " ");
		board[col] = false;

		// Not Place
		QC(board, col + 1, tq, qpsf, ans);

	}

}

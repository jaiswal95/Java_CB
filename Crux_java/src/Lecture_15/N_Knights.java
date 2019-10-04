package Lecture_15;

public class N_Knights {
	public static void main(String[] args) {
		KnightCombinationBoxRespect2DRecCall(new boolean[2][2], 0, 0, 2, 0, "");
	}

	static int count = 0;

	public static void KnightCombinationBoxRespect2DRecCall(boolean[][] board, int row, int col, int tq, int qpsf,
			String ans) {

		if (qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}

		if (col == board[0].length) {
			KnightCombinationBoxRespect2DRecCall(board, row + 1, 0, tq, qpsf, ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		// place

		if (isItSafeToPlaceKnight(board, row, col)) {
			board[row][col] = true;
			KnightCombinationBoxRespect2DRecCall(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}

		// not place
		KnightCombinationBoxRespect2DRecCall(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isItSafeToPlaceKnight(boolean[][] board, int row, int col) {

		int[] rowArr = { -1, -2, -2, -1 };
		int[] colArr = { -2, -1, 1, 2 };

		for (int i = 0; i < rowArr.length; i++) {

			int nr = row + rowArr[i];
			int nc = col + colArr[i];

			if (nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length) {

				if (board[nr][nc]) {
					return false;
				}
			}
		}

		return true;

	}

}

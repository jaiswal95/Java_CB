package Lecture_15;

public class Blocked_maze {

	public static void main(String[] args) {
		int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		block_maze(board, 0, 0, "", new boolean[board.length][board[0].length]);
	}

	public static void block_maze(int[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] == true
				|| board[row][col] == 1) {
			return;
		}
		// Tick the visited block
		visited[row][col] = true;

		// Bottom
		block_maze(board, row + 1, col, ans + "B", visited);
		// Top
		block_maze(board, row - 1, col, ans + "T", visited);
		// Left
		block_maze(board, row, col - 1, ans + "L", visited);
		// Right
		block_maze(board, row, col + 1, ans + "R", visited);

		// Undo the visited block
		visited[row][col] = false;
	}
}

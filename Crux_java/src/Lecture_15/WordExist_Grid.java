package Lecture_15;

import java.util.Scanner;

public class WordExist_Grid {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String Word = scn.next();

		//boolean res = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == Word.charAt(0)) {
					res = res || SearchWord1(board, i, j, 0, new boolean[board.length][board[0].length], Word);
				}
			}
		}
		System.out.println(res);

	}

	
	static boolean res = false;

	public static void SearchWord(char[][] board, int row, int col, int vidx, boolean[][] visited, String Word) {

		if (vidx == Word.length()) {
			res = true;
			return;
		}

		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] == true) {
			return;
		}
		if (Word.charAt(vidx) != board[row][col]) {
			return;
		}

		// Tick the visited block
		visited[row][col] = true;

		// Bottom
		SearchWord(board, row+1, col, vidx + 1, visited, Word);
		// Top
		SearchWord(board, row-1, col, vidx + 1, visited, Word);
		// Left
		SearchWord(board, row, col-1, vidx + 1, visited, Word);
		// Right
		SearchWord(board, row, col+1, vidx + 1, visited, Word);

		// Undo the visited block
		visited[row][col] = false;

	}
	

	public static boolean SearchWord1(char[][] board, int row, int col, int vidx, boolean[][] visited, String Word) {

		if (vidx == Word.length()) {

			return true;
		}

		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] == true) {
			return false;
		}
		if (Word.charAt(vidx) != board[row][col]) {
			return false;
		}

		// Tick the visited block
		visited[row][col] = true;

		// Bottom
		boolean B = SearchWord1(board, row+1, col, vidx + 1, visited, Word);
		// Top
		boolean T = SearchWord1(board, row-1, col, vidx + 1, visited, Word);
		// Left
		boolean L = SearchWord1(board, row, col-1, vidx + 1, visited, Word);
		// Right
		boolean R = SearchWord1(board, row, col+1, vidx + 1, visited, Word);

		// Undo the visited block
		visited[row][col] = false;

		return B || T || L || R;

	}

}

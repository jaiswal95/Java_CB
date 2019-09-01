package Lecture_7;

public class Spiral_Display {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		SpiralDisplay(arr);

	}

	public static void SpiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;

		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {

			// First col
			for (int r = minRow; r <= minRow && count < nel; r++) {

				System.out.print(arr[r][minCol] + " ");
				count++;
			}
			minCol++;

			// Last Row
			for (int c = minCol; c <= maxCol && count < nel; c++) {

				System.out.print(arr[maxRow][c] + " ");
				count++;
			}
			maxRow--;

			// Last Col
			for (int r = maxRow; r >= minRow && count < nel; r--) {

				System.out.print(arr[r][maxCol] + " ");
				count++;
			}
			maxCol--;

			// First row
			for (int c = maxCol; c >= minCol && count < nel; c--) {

				System.out.print(arr[minRow][c] + " ");
				count++;
			}

		}

	}

}

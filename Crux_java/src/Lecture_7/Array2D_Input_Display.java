package Lecture_7;

import java.util.Scanner;

public class Array2D_Input_Display {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);

	}

	public static int[][] takeInput() {

		int row = scn.nextInt();

		// Create a new array
		int[][] arr = new int[row][];

		// loop on every row
		for (int r = 0; r < arr.length; r++) {

			int col = scn.nextInt();

			// Point to some address memory
			arr[r] = new int[col];

			for (int c = 0; c < arr[r].length; c++) {

				arr[r][c] = scn.nextInt();

			}
		}
		return arr;

	}

	public static void display(int[][] arr) {

		for (int r = 0; r < arr.length; r++) {

			for (int c = 0; c < arr[r].length; c++) {

				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

}

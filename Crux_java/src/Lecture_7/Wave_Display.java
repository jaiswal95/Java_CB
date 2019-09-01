package Lecture_7;

import java.util.Scanner;

public class Wave_Display {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		WaveDisplay(arr);
	}

	public static void WaveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++)
					System.out.print(arr[r][c] + " ");
			} else {
				for (int r = arr.length - 1; r >= 0; r--)
					System.out.print(arr[r][c] + " ");
			}

		}
	}

}

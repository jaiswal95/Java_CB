package Lecture_6;

import java.util.Scanner;

public class Subset_Of_Array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		subset(arr);
		// display(arr);

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}

		System.out.println();

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);

		for (int i = 0; i <= limit - 1; i++) {

			int temp = i;

			// Binary
			for (int digit = 0; digit <= arr.length; digit++) {

				int rem = temp % 2;

				if (rem == 1) {
					System.out.print(arr[digit] + "  ");
				}
				temp = temp / 2;

			}
			System.out.println();

		}
	}

}

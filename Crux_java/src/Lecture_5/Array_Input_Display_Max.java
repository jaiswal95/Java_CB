package Lecture_5;

import java.util.Scanner;

public class Array_Input_Display_Max {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();

		// display(arr);

		System.out.println(max(arr));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {

		int m = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}

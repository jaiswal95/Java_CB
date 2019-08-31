package Lecture_6;

import java.util.Scanner;

public class Reverse_Of_Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		reverse(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;

		}

	}

}

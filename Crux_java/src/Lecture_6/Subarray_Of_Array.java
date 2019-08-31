package Lecture_6;

import java.util.Scanner;

public class Subarray_Of_Array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		Subarray(arr);
//		display(arr);

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

	public static void Subarray(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}
			
				System.out.println();
			}

		}
	}

}

package Lecture_6;

import java.util.Scanner;

public class Rotation_Of_Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int rot =scn.nextInt();
		//display(arr);
		rotate(arr,rot);
		display(arr);
		

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

	public static void rotate(int[] arr, int rot) {

		

		for (int r = 1; r <= rot; r++) {
			int temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i--) {

				arr[i] = arr[i - 1];

			}
			arr[0] = temp;
		}

	}

}






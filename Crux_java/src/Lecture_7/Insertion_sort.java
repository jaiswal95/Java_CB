package Lecture_7;

import java.util.Scanner;

public class Insertion_sort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		Insertionsort(arr);
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

	public static void Insertionsort(int[] arr) {

		for (int count = 1; count <= arr.length - 1; count++) {

			// Capturing the value.
			int temp = arr[count];

			// Shifting
			int j = count - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

	}

}

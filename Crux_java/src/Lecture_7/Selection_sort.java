package Lecture_7;

import java.util.Scanner;

public class Selection_sort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		SelectionSort(arr);
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

	public static void SelectionSort(int[] arr) {

		for (int count = 0; count <= arr.length - 2; count++) {

			int min = count;

			for (int j = count + 1; j <= arr.length - 1; j++) {

				if (arr[j] < arr[min]) {

					min = j;

				}
			}
			// Swapping
			int temp = arr[count];
			arr[count] = arr[min];
			arr[min] = temp;

		}
	}

}

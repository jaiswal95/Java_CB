package Lecture_6;

import java.util.Scanner;

public class Bubble_sort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		bubblesort( arr);
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

	public static void bubblesort(int[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {

			for (int j = 0; j <= arr.length - count - 2; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}

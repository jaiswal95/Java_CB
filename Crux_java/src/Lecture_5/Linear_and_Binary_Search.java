package Lecture_5;

import java.util.Scanner;

public class Linear_and_Binary_Search {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int item = scn.nextInt();
		// display(arr);
		int res = binarysearch(arr, item);
		System.out.println(res);
//		int res1=linearSearch( arr,  item);
//		System.out.println(res1);

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

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;

	}

	public static int binarysearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}

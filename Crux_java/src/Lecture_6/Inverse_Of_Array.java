package Lecture_6;

import java.util.Scanner;

public class Inverse_Of_Array {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();

		int[] ans = inverse(arr);
		display(ans);

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

	public static int[] inverse(int[] arr) {

		int[] na = new int[arr.length];

		for (int i = 0; i < na.length; i++) {
			na[arr[i]] = i;

		}

		return na;
	}

}

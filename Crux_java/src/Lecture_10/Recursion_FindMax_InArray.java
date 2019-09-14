package Lecture_10;

import java.util.Scanner;

public class Recursion_FindMax_InArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		System.out.println(max(arr, 0));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int max(int[] arr, int V_idx) {

		// Base case
		if (V_idx == arr.length - 1) {
			return arr[V_idx];
		}

		// Smaller Problem
		int sp = max(arr, V_idx + 1);

		// Self Work
		return Math.max(sp, arr[V_idx]);

	}

}

package Lecture_10;

import java.util.Scanner;

public class Recursion_FindAllIndex_InArray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		int item = scn.nextInt();

		int[] res = AllIndex(arr, 0, 20, 0);

		// Enhanced loop
		for (int val : res) {
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

	public static int[] AllIndex(int[] arr, int V_idx, int item, int count) {

		// Base Case
		if (V_idx == arr.length) {
			int[] br = new int[count];
			return br;

		}
		int[] rr;
		if (V_idx == item) {
			rr = AllIndex(arr, V_idx + 1, item, count + 1);
			rr[count] = V_idx;
		} else {
			rr = AllIndex(arr, V_idx + 1, item, count);

		}
		return rr;

	}

}

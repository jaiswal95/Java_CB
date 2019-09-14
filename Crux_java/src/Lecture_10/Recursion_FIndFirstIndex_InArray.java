package Lecture_10;

import java.util.Scanner;

public class Recursion_FIndFirstIndex_InArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		int item=scn.nextInt();
		System.out.println(FirstIndex( arr,  0,  item));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int FirstIndex(int[] arr, int V_idx, int item) {

		// Base Case
		if (V_idx == arr.length) {
			return -1;
		}
		// Self Work
		if (arr[V_idx] == item) {
			return V_idx;
		}

		// Smaller Problem
		int sp = FirstIndex(arr, V_idx + 1, item);
		return sp;

	}

}

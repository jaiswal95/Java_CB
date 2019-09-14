package Lecture_10;

import java.util.Scanner;

public class Recursion_FindLastIndex_InArray {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		int item=scn.nextInt();
		System.out.println(LastIndex( arr,  0,  item));

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int LastIndex(int[] arr, int V_idx, int item) {

		// Base Case
		if (V_idx == arr.length) {
			return -1;
		}

		// Smaller Problem
		int sp = LastIndex(arr, V_idx + 1, item);

		// Self Work
		if (arr[V_idx] == item && sp == -1) {
			return V_idx;

		}
		return sp;

	}
}

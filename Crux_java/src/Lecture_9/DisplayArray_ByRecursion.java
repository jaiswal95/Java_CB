package Lecture_9;

import java.util.Scanner;

public class DisplayArray_ByRecursion {
	
      static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		
		
		
	}
	
	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static void Display_Array(int[] arr, int Virtual_idx) {

		// Base case
		if (Virtual_idx == arr.length) {
			return;
		}
		// Self work
		System.out.println(arr[Virtual_idx]);
		// Samller Problem
		Display_Array(arr, Virtual_idx + 1);

	}

}

package Lecture_17;

/*
 Before Sorting
 50, 40, 80, 90, 70, 10, 30, 60, 120
 
 After Sorting
 10, 30, 40, 50, 60, 70, 80, 90, 120
 */
import java.util.Scanner;

public class DivideandConquer_QuickSort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		Qc(arr, 0, arr.length - 1);

		for (int val : arr) {
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

	public static void Qc(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		// Partitioning

		int left = lo;
		int right = hi;

		while (left <= right) {

			// Left Problem
			while (arr[left] < pivot) {
				left++;
			}

			// Right Problem
			while (arr[right] > pivot) {
				right--;
			}

			// Swapping held
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}
		// Partition Complete.

		Qc(arr, lo, right);
		Qc(arr, left, hi);

	}

}

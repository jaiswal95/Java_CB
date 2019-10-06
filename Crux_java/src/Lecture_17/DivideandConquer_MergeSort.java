package Lecture_17;

/*
 Before Sorting
 50, 40, 80, 90, 70, 10, 30, 60, 120
 
 After Sorting
 10, 30, 40, 50, 60, 70, 80, 90, 120
 */
import java.util.Scanner;

public class DivideandConquer_MergeSort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		int[] merged = MergeSort(arr, 0, arr.length - 1);
		for (int val : merged) {
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

	public static int[] MergeTwoSortedArray(int[] one, int[] two) {

		int[] ans = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {

				ans[k] = one[i];
				i++;
				k++;

			} else {

				ans[k] = two[j];
				j++;
				k++;

			}

		}
		if (i == one.length) {
			while (j < two.length) {
				
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				
				ans[k] = one[i];
				i++;
				k++;
			}
		}
		return ans;

	}

	public static int[] MergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {

			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = MergeSort(arr, lo, mid);
		int[] sh = MergeSort(arr, mid + 1, hi);

		int[] merged = MergeTwoSortedArray(fh, sh);
		return merged;

	}

}

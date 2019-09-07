package Lecture_8;

import java.util.ArrayList;

public class Arraylist_Sum_Of_Array {

	public static void main(String[] args) {
		int[] a1 = { 9, 9, 6, 4 };
		int[] a2 = { 9, 9 };
		System.out.println(Sum_of_array(a1,a2));
	}

	public static ArrayList<Integer> Sum_of_array(int[] a1, int[] a2) {
		ArrayList<Integer> ans = new ArrayList<>();

		int carry = 0;
		int i = a1.length - 1;
		int j = a2.length - 1;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += a1[i];
			if (j >= 0)
				sum += a2[j];

			int rem = sum % 10;
			carry = sum / 10;
			ans.add(0, rem);

			i--;
			j--;
		}
		if (carry != 0) {
			ans.add(0, carry);
		}
		return ans;

	}

}

package Lecture_8;

import java.util.ArrayList;

public class ArrayList_Intersection {

	public static void main(String[] args) {
		int[] one = { 10, 20, 20, 30, 40, 40, 90, 90, 100 };
		int[] two = { 10, 15, 20, 20, 20, 30, 30, 40, 40, 40, 90, 200, 300 };

		System.out.println(intersection(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();

		// 2 pointer approach
		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				ans.add(one[i]);
				i++;
				j++;
			}
		}

		return ans;

	}
}

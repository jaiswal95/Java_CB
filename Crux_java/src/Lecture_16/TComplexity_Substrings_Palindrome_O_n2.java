package Lecture_16;

import java.util.Scanner;

public class TComplexity_Substrings_Palindrome_O_n2 {
	static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) {
		String str = scn.next();
		System.out.println(countPalindrome_Substring(str));
	}

	public static int countPalindrome_Substring(String str) {
		int count = 0;
		// Odd Length
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit))
					count++;
				else
					break;

			}

		}
		// Even Length
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit)))
					count++;
				else
					break;

			}

		}
		return count;
	}

}

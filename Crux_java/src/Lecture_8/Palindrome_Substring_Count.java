package Lecture_8;

import java.util.Scanner;

public class Palindrome_Substring_Count {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.next();
		printChar(str);
		//substrings(str);
		System.out.println(palindrome(str));
		//int res = countPalindrome_Substring(str);
		//System.out.println(res);

	}

	public static void printChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static boolean palindrome(String str) {

		// 2 pointer Approach
		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void substrings(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

			}
		}
	}

	public static int countPalindrome_Substring(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (palindrome(ss)) {
					count++;
				}
			}
		}
		return count;
	}
}

package Lecture_13;

import java.util.Scanner;

public class Palindrome_Partition {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		 PP(str,"");

	}

	public static void PP(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {

			String ch = str.substring(i);
			String ros = str.substring(0, i);

			if (palindrome(ros)) {
				PP(ch, ans + ros + " ");
			}

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

}

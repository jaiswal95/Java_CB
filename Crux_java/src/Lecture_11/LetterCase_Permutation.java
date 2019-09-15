package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCase_Permutation {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		System.out.println(LowerUpper(str));

	}

	public static ArrayList<String> LowerUpper(String str) {
		// Base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		// Smaller Problem
		ArrayList<String> rr = LowerUpper(ros);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();
		if (Character.isDigit(ch)) {

			for (String val : rr) {
				mr.add(ch + val);

			}
		} else {
			for (String val : rr) {
				mr.add(Character.toLowerCase(ch) + val);
				mr.add(Character.toUpperCase(ch) + val);

			}
		}
		return mr;
	}

}

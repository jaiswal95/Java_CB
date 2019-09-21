package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_Arrangement {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		// System.out.println(Arrangement(str));
		Arrangement2(str, "");

	}

	public static ArrayList<String> Arrangement(String str) {
		// Base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		// Smaller Problem
		ArrayList<String> rr = Arrangement(ros);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {

				mr.add(val.substring(0, i) + ch + val.substring(i));
			}

		}
		return mr;
	}

	public static void Arrangement1(String str, String ans) {
		// Base case
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			Arrangement1(ros, ans + ch);

		}
	}

	public static void Arrangement2(String str, String ans) {
		// Base case
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		for (int i = 0; i <= ans.length(); i++) {

			Arrangement2(ros, ans.substring(0, i) + ch + ans.substring(i));

		}
	}

}

package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_Arrangement {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str=scn.next();
		System.out.println(Arrangement(str));

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

}

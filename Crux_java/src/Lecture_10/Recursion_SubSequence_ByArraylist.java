package Lecture_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_SubSequence_ByArraylist {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		//System.out.println(GetSubSequence(str));
		//System.out.println(GetSubSequeVal(str));
		sp(str,"");
		
	}

	public static ArrayList<String> GetSubSequence(String str) {

		// Base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// Smaller problem
		ArrayList<String> rr = GetSubSequence(ros);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(ch + val);
		}

		return mr;
	}

	public static ArrayList<String> GetSubSequeVal(String str) {

		// Base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// Smaller problem
		ArrayList<String> rr = GetSubSequeVal(ros);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(ch + val);
			mr.add((int) ch + val);

		}

		return mr;
	}
	
	// Recursion Print
	public static void sp(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		sp(ros, ans); // No
		sp(ros, ans + ch); // Yes

	}

}

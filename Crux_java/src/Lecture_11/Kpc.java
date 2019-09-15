package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Kpc {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str =scn.next();
		System.out.println(getKpc(str));
		

	}

	public static ArrayList<String> getKpc(String str) {
		// Base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// Smaller problem
		ArrayList<String> rr = getKpc(ros);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();

		String code = getcode(ch);
		
		for(int i=0;i<code.length();i++) {
			for(String val:rr) {
				mr.add(code.charAt(i)+val);
			}
		}
		return mr;

	}

	public static String getcode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '9')
			return "@#";
		else
			return "";

	}

}

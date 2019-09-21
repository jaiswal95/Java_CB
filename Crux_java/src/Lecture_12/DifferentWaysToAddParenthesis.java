package Lecture_12;

import java.util.ArrayList;
import java.util.Scanner;

public class DifferentWaysToAddParenthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
	
		System.out.println(AddParenthesis(str));

	}

	public static ArrayList<Integer> AddParenthesis(String str) {

		ArrayList<Integer> mr = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '+' || ch == '-' || ch == '*') {

				String p1 = str.substring(0, i);
				String ros = str.substring(i + 1);

				ArrayList<Integer> rr1 = AddParenthesis(p1);
				ArrayList<Integer> rr2 = AddParenthesis(ros);

				for (int val1 : rr1) {
					for (int val2 : rr2) {
						if (ch == '+') {
							mr.add(val1 + val2);
						} else if (ch == '-') {
							mr.add(val1 - val2);
						} else if (ch == '*') {
							mr.add(val1 * val2);
						}
					}
				}
			}
		}
		if(mr.size()==0) {
			mr.add(Integer.parseInt(str));
		}
		return mr;
	}

}

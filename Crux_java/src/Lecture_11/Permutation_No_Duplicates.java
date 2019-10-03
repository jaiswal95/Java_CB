package Lecture_11;

import java.util.Scanner;

public class Permutation_No_Duplicates {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.next();
		No_duplicates(str,"");

	}
	
	public static void No_duplicates(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			int flag = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					flag++;
				}
			}

			if (flag == 0)
				No_duplicates(ros, ans + ch);

		}

	}

}
package Lecture_13;

import java.util.Scanner;

public class Valid_Parenthesis {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int open = scn.nextInt();
		int close = scn.nextInt();
		VP(n, open, close, "");

	}

	public static void VP(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}

		VP(n, open + 1, close, ans + "(");
		VP(n, open, close + 1, ans + ")");

	}

}

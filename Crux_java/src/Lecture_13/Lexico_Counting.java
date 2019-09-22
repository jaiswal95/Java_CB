package Lecture_13;

import java.util.Scanner;

public class Lexico_Counting {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int current = scn.nextInt();
		int end = scn.nextInt();
		lc(current, end);

	}

	public static void lc(int current, int end) {
		if (current > end) {
			return;
		}

		System.out.println(current);
		int i = 0;
		if (current == 0) {
			i = 1;

		}
		while (i < 10) {

			lc(current * 10 + i, end);
			i++;
		}

	}

}

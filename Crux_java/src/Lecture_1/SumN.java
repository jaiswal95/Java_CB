package Lecture_1;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = 1;
		int ans = 0;
		while (c <= n) {
			ans = ans + c;
			c++;
		}
		System.out.println(ans);

	}

}

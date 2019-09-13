package Lecture_BackupClass;

import java.util.Scanner;

public class Square_and_Sum {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int ans = 0;
		int res = 0;
		while (n != 0) {
			int rem = n % 10;

			ans += Square(rem);
			n /= 10;
		}
		System.out.println(ans);

	}

	public static int Square(int rem) {
		int res = 0;
		res = rem * rem;
		return res;
	}

}

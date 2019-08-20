package Lecture_1;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		long n = scn.nextInt();
		long ans = 0;
		while (n != 0) {
			long remainder = n % 10;
			ans = ans * 10 + remainder;
			n = n / 10;

		}
		System.out.println(ans);

	}

}
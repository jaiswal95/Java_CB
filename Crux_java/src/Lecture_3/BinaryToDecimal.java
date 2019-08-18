package Lecture_3;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int rem = 1;
		int multiplier = 1;
		while (n != 0) {
			rem = n % 10;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 2;
			n = n / 10;

		}
		System.out.println(ans);

	}

}

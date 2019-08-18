package Lecture_3;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int anyBase = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		while (n != 0) {
			int rem = n % anyBase;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 10;
			n = n / anyBase;

		}
		System.out.println(ans);

	}

}

package Lecture_3;

import java.util.Scanner;

public class Rotation_Of_Numbers {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int nod = 0;
		int temp = n;
		int ans = 0;

		// Number of Digits.
		while (temp != 0) {
			temp = temp / 10;
			nod++;

		}

		// Rotation logic
		rot = rot % nod; // Minimize the value of rotation.

		if (rot < 0) {
			rot = rot + nod; // Loop for -ve rotation.
		}

		for (int i = 0; i < rot; i++) {
			int Last_Digit = n % 10;
			int Quotient = n / 10;
			int Start = (int) Math.pow(10, nod - 1);

			ans = Last_Digit * Start + Quotient;
			n = ans; // Update the value of n.
		}
		System.out.println(ans);
	}
}

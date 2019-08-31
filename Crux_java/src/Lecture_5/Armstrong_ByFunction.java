package Lecture_5;

import java.util.Scanner;

public class Armstrong_ByFunction {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		printAllarmstrong(n1, n2);

	}

	public static void printAllarmstrong(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			boolean res = isArmstrong(i);
			if (res == true) {
				System.out.println(i);
			}

		}
	}

	public static boolean isArmstrong(int n) {
		int nod = numberofDigits(n);
		int ans = 0;
		int temp = n;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}
		if (temp == ans)
			return true;
		else
			return false;

	}

	public static int numberofDigits(int n) {
		int res = 0;
		while (n != 0) {
			res++;
			n = n / 10;
		}

		return res;
	}

}

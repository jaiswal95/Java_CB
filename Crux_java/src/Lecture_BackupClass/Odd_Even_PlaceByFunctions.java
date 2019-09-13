package Lecture_BackupClass;

import java.util.Scanner;

public class Odd_Even_PlaceByFunctions {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int Sum_Even = 0;
		int Sum_Odd = 0;
		while (n != 0) {
			int rem = n % 10;
			if (Oddevenplace(rem) == true) {
				Sum_Even += rem;
			} else {
				Sum_Odd += rem;
			}
			n /= 10;
		}
		System.out.println(Sum_Even + "\n" + Sum_Odd);

	}

	public static boolean Oddevenplace(int rem) {

		if (rem % 2 == 0)
			return true;
		else
			return false;

	}

}

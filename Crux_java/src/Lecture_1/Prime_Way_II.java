package Lecture_1;

import java.util.Scanner;

public class Prime_Way_II {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 0;
		int count = 1;
		while (count <= n) {
			if (n % count == 0) {
				fact++;

			}
			count++;
		}
		if (fact == 2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}

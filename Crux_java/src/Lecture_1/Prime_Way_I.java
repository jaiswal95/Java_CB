package Lecture_1;

import java.util.Scanner;

public class Prime_Way_I {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int flag = 0;
		int count = 2;
		while (count <= n - 1) {
			if (n % count == 0) {
				System.out.println("Not Prime");
				flag = 1;
				break;
			}
			count++;
		}
		if (flag == 0) {
			System.out.println("Prime");
		}

	}

}

/*
 
7
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
* * * * * * * 
 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n / 2 + 1;
		int nsp = 0;

		// Rows
		int row = 1;

		while (row <= n) {
			// Work

			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// spaces
			int csp = 1;
			if (row == 2) {
				nsp = 1;
			}
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			cst = 1;
			if (row == 1 || row == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Prep
			if (row <= n / 2) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}
			System.out.println();
			row++;
		}

	}

}

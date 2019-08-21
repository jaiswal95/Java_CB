/*
 
7
      * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 
 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp = n / 2;
		int nst = 1;

		// Rows
		int row = 1;

		while (row <= n) {
			// Work

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}

			// Prep
			if (row <= n / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}

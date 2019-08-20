/*
 
 5
* * * * * 
    * * * * 
        * * * 
            * * 
                * 
            * * 
        * * * 
    * * * * 
* * * * * 
 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = 0;
		int row = 1;
		while (row <= 2 * n - 1) {

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Preparation
			if (row <= n - 1) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;

			}

			row++;
			System.out.println();
		}
	}

}

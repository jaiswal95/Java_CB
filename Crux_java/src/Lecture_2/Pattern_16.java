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

public class Pattern_16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n;
		int nsp = n - 1;

		// Rows
		int row = 1;

		while (row <= 2 * n - 1) {
			// Work

			// Space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Prep
			if (row <= n - 1) {
				nsp--;
				nst--;
			} else {
				nsp++;
				nst++;
			}
			row++;

			System.out.println();
		}

	}

}

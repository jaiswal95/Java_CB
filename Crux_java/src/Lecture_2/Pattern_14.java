/*
  
5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Spaces

			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Preparation

			if (row <= n - 1) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}
			row++;
			System.out.println();
		}

	}
}

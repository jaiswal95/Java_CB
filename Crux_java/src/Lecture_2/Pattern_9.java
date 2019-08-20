/*
 
5
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= n) {

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
			row++;
			nst += 2;
			nsp--;
			System.out.println();
		}
	}

}

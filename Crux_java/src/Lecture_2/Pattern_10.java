/*
 
5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 2*n-1;
		int nsp = 0;
		int row = 1;
		while (row <= n) {

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Work
			int cst =1 ;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Preparation
			row++;
			nst-=2;
			nsp++;
			System.out.println();
		}
	}

}

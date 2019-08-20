/*
 
5
* * * * * 
* * * * 
* * * 
* * 
* 
 
*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_3_WAY_II {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int row = 1;
		while (row <= n) {

			// Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Preparation
			row++;
			nst--;
			System.out.println();
		}
	}

}

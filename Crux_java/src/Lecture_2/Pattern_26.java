/*
 
5
				1	
			1	2	3	
		1	2	3	4	5	
	1	2	3	4	5	6	7	
1	2	3	4	5	6	7	8	9	


 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_26 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val = 1;
		while (row <= n) {
			val = 1;
			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("	");
				csp++;
			}

			// Numbering
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "	");
				val++;
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

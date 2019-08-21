/*
 
5
				1	
			2	3	4	
		5	6	7	8	9	
	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25	


 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_25 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val = 1;
		while (row <= n) {

			// Spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("	");
				csp++;
			}

			// Work
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

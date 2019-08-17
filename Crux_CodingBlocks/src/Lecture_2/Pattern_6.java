package Lecture_2;
/*

 
 * * * * * 
    * * * * 
        * * * 
            * * 
                * 
*/
import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = 0;
		int nst = n;

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
				System.out.print("* ");
				cst++;
			}

			// Prep
			row++;
			nsp += 2;
			nst--;
			System.out.println();
		}

	}

}


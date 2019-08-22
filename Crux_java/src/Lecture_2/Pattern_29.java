/*
 
 5
        1 
      2 0 2 
    3 0 0 0 3 
  4 0 0 0 0 0 4 
5 0 0 0 0 0 0 0 5
 
 */



package Lecture_2;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = 1;
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
				if(cst==1 || cst==nst) {
				System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				cst++;
			}

			// Preparartion
			nsp--;
			nst+=2;
			System.out.println();
			row++;
		}

	}

}

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

public class Pattern_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;
		while (row <= 2 * n - 1) {

			// Star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Preparation
			
			if (row <= n - 1)
				nst++;
			else
				nst--;
			row++;
			System.out.println();
		}

	}
}
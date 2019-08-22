/*
 
5
1 

2 * 2 

3 * 3 * 3 

4 * 4 * 4 * 4 

5 * 5 * 5 * 5 * 5 

4 * 4 * 4 * 4 

3 * 3 * 3 

2 * 2 

1 

*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int start = 1;
		int nst = 1;
		int row = 1;

		while (row <= 2 * n - 1) {
			// Work

			int cst = 1;
			while (cst <= nst) {

				if (cst % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(start + " ");
				cst++;
			}
			// Prep
			if (row <= n - 1) {
				nst += 2;
				start++;
			} else {
				nst -= 2;
				start--;
			}
			System.out.println();
			System.out.println();
			row++;

		}

	}

}


/*
5
* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_7 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col;
		while (row <= n) {
			col = 1;
			while (col <= n) {
				if (row == 1 || row == 5 || col == 1 || col == 5)
					System.out.print("* ");
				else
					System.out.print("  ");
				col++;
			}
			row++;
			System.out.println();
		}
	}

}

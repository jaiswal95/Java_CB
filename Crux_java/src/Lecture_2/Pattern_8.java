
/*

5
*       * 
  *   *   
    *     
  *   *   
*       * 

*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_8 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col;
		while (row <= n) {
			col = 1;
			while (col <= n) {
				if (row == col||col+row==n+1)
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

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

public class Pattern_3_WAY_I {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col;
		while (row <= n) {
			col = 5;
			while (col >= row) {
				System.out.print("* ");
				col--;
			}
			row++;
			System.out.println();
		}
	}

}

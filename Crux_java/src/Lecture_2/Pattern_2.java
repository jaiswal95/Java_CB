/*
 
5
* 
* * 
* * * 
* * * * 
* * * * * 
 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col = 1;
		while (row <= n) {
			col = 1;
			while (col <= row) {
				System.out.print("* ");
				col++;
			}
			row++;
			System.out.println();
		}
	}

}

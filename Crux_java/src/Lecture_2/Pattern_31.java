
/*

5

5  4  3  2  *  
5  4  3  *  1  
5  4  *  2  1  
5  *  3  2  1  
*  4  3  2  1  


*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_31 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col = 1;
		while (row <= n) {
			int val = 5;
			col = 1;
			while (col <= n) {
				if (col + row == n + 1) {
					System.out.print("*" + "  ");
				} else {
					System.out.print(val + "  ");
				}
				col++;
				val--;
			}
			row++;
			System.out.println();
		}
	}

}

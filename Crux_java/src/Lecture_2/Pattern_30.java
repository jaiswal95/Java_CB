
/*

5

5  4  3  2  1  
5  4  3  2  1  
5  4  3  2  1  
5  4  3  2  1  
5  4  3  2  1  


*/

package Lecture_2;

import java.util.Scanner;

public class Pattern_30 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col = 1;
		while (row <= n) {
			int val = 5;
			col = 1;
			while (col <= n) {
				System.out.print(val + "  ");
				col++;
				val--;
			}
			row++;
			System.out.println();
		}
	}

}

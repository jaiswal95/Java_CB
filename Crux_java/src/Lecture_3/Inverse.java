package Lecture_3;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int ans=0;
		int pos=1;
		while(n!=0) {
			int rem=n%10;
			ans= ans+ pos*(int)Math.pow(10, rem-1);
			pos++;
			n=n/10;
			
		}
		System.out.println(ans);

	}

}

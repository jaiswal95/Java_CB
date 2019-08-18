package Lecture_1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	 
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		while(c<n) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			c++;
		}
		System.out.println(sum);

	}

}

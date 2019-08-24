package Lecture_4;

import java.util.Scanner;

public class fahrenheit_To_Celsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();

		for (int t = minF; t <= maxF; t = t + step) {
			 int c = (int)((5.0/9)*(t-32));
			 System.out.println(t+"\t"+c);

		}

	}

}

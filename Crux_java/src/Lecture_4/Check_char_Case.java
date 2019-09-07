package Lecture_4;

import java.util.Scanner;

public class Check_char_Case {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		}else {
			System.out.println("Invalid");
	}

}
}
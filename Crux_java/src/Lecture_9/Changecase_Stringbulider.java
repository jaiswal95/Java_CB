package Lecture_9;

import java.util.Scanner;

public class Changecase_Stringbulider {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// System.out.println(changeCaseUpdate(scn.next()));
		System.out.println(changeCaseAppend(scn.next()));
	}

	public static String changeCaseUpdate(String str) {

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			char ch = sb.charAt(i);

			if (Character.isLowerCase(ch)) {

				sb.setCharAt(i, Character.toUpperCase(ch));

			} else if (Character.isUpperCase(ch)) {

				sb.setCharAt(i, Character.toLowerCase(ch));

			}

		}

		return sb.toString();

	}

	public static String changeCaseAppend(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {

				sb.append(Character.toUpperCase(ch));

			} else if (Character.isUpperCase(ch)) {

				sb.append(Character.toLowerCase(ch));
			}

		}

		return sb.toString();
	}

	public static String changeCase(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				sb.setCharAt(i, (char) (ch - 32));

			} else if (ch >= 'A' && ch <= 'Z') {

				sb.setCharAt(i, (char) (ch + 32));
			}

		}

		return sb.toString();

	}

}

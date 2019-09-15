package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Board_path {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(Path_2(0, 10));

	}

	public static ArrayList<String> Path_1(int Current, int End) {

		// Base Case
		if (Current == End) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6 && Current + dice <= End; dice++) {
			ArrayList<String> rr = Path_1(Current + dice, End);
			for (String val : rr) {
				mr.add(dice + val);
			}
		}
		return mr;
	}

	public static ArrayList<String> Path_2(int Current, int End) {

		// Base Case
		if (Current == End) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (Current > End) {
			ArrayList<String> br = new ArrayList<>();
			return br;

		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = Path_2(Current + dice, End);
			for (String val : rr) {
				mr.add(dice + val);
			}
		}
		return mr;
	}

}

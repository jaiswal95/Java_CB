package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Board_path {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int Current=scn.nextInt();
		int End=scn.nextInt();
		//System.out.println(Path_2(Current,End));
		Path_3(Current,End,"");

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

	public static void Path_3(int Current, int End, String ans) {

		// Base Case
		if (Current == End) {
			System.out.println(ans);
			return;
		}
		if (Current > End) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			Path_3(Current + dice, End, ans+dice);

		}

	}

}

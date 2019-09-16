package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze_Path {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
        
		// System.out.println(getMazePath(cr, cc, er, ec));
		getMazePath_1(cr, cc, er, ec, "");

	}

	public static ArrayList<String> getMazePath(int current_row, int current_column, int end_row, int end_column) {

		if (current_row == end_row && current_column == end_column) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (current_row > end_row || current_column > end_column) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePath(current_row, current_column + 1, end_row, end_column);
		for (String val : rrh) {
			mr.add("H" + val);
		}

		ArrayList<String> rrv = getMazePath(current_row + 1, current_column, end_row, end_column);
		for (String val : rrv) {
			mr.add("V" + val);
		}

		return mr;

	}

	public static void getMazePath_1(int current_row, int current_column, int end_row, int end_column, String ans) {

		if (current_row == end_row && current_column == end_column) {
			System.out.println(ans);
			return;
		}
		if (current_row > end_row || current_column > end_column) {
			return;
		}

		getMazePath_1(current_row, current_column + 1, end_row, end_column, ans + "H");

		getMazePath_1(current_row + 1, current_column, end_row, end_column, ans + "V");

	}

}

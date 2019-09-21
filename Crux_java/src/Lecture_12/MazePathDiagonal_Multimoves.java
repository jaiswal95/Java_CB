package Lecture_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathDiagonal_Multimoves {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		//System.out.println(MazePath(cr, cc, er, ec));
		 getMazePath_1(cr, cc, er, ec, "");

	}

	public static ArrayList<String> MazePath(int current_row, int current_column, int end_row, int end_column) {

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
		for (int move = 1; move <= end_column - current_column; move++) {
			ArrayList<String> rrh = MazePath(current_row, current_column + move, end_row, end_column);
			for (String val : rrh) {
				mr.add("H" + move + val);
			}
		}
		for (int move = 1; move <= end_row - current_row; move++) {
			ArrayList<String> rrv = MazePath(current_row + move, current_column, end_row, end_column);
			for (String val : rrv) {
				mr.add("V" + move + val);
			}
		}
		for (int move = 1; move <= end_column - current_column && move <= end_row - current_row; move++) {
			ArrayList<String> rrd = MazePath(current_row + move, current_column + move, end_row, end_column);
			for (String val : rrd) {
				mr.add("D" + move + val);
			}
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
		for (int move = 1; move <= end_column - current_column; move++)
			getMazePath_1(current_row, current_column + move, end_row, end_column, ans + "H" + move);

		for (int move = 1; move <= end_row - current_row; move++)
			getMazePath_1(current_row + move, current_column, end_row, end_column, ans + "V" + move);

		for (int move = 1; move <= end_column - current_column && move <= end_row - current_row; move++)
			getMazePath_1(current_row + move, current_column + move, end_row, end_column, ans + "D" + move);

	}

}

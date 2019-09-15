package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze_Path {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//String str= scn.next();
		System.out.println(getMazePath(0,0,2,2));

	}

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePath(cr, cc+1, er, ec);
		for (String val : rrh) {
			mr.add("H" + val);
		}

		ArrayList<String> rrv = getMazePath(cr+1, cc, er, ec);
		for (String val : rrv) {
			mr.add("V" + val);
		}

		return mr;

	}

}

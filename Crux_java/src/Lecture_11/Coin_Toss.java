package Lecture_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Coin_Toss {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		System.out.println(GetCoin_Toss(n));

	}

	public static ArrayList<String> GetCoin_Toss(int n) {
		// Base case
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		// Smaller Problem
		ArrayList<String> rr = GetCoin_Toss(n - 1);

		// Self Work
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);

		}
		return mr;
	}

}

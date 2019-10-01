package Lecture_14;

import java.util.Scanner;

public class CoinChangeCombination_CoinRespect {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int amount = scn.nextInt();
		cc(arr, 0, amount, "");

	}

	public static int[] takeInput() {

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void cc(int[] arr, int vidx, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (vidx == arr.length || amount < 0) {
			return;
		}

		// Yes
		cc(arr, vidx, amount - arr[vidx], ans + arr[vidx]);

		// No
		cc(arr, vidx + 1, amount, ans);
	}

}

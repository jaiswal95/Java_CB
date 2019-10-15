package Lecture_20;

import java.util.Scanner;

import Lecture_18.Stack;
import Lecture_19.DymanicStack;

public class StackQs {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		Stack s = new DymanicStack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println("----Display Rverese-----");
		s.display();
		DisplayReverse(s);
		s.display();

		System.out.println("------Actual Reverse-----");
		s.display();
		ActualReverse(s, new DymanicStack());
		s.display();

		System.out.println("-------NGE-------");
		int[] arr = takeInput();
		NextGreaterElement(arr);

//		System.out.println("-------NGE2-------");
//		int[] arr = takeInput();
//		int[] ans = NextGreaterElement2(arr);
//
//		int i = 0;
//		for (int val : ans) {
//			System.out.println(arr[i++] + " --> " + val);
//		}

		System.out.println("-------Stock Span-------");
		int[] arr1 = { 90, 60, 15, 70, 45, 25, 50, 100, 5, 30, 80 };
		int[] ans = StockSpan(arr1);

		int i = 0;
		for (int val : ans) {
			System.out.println(arr1[i++] + " --> " + val);
		}

	}

	public static int[] takeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	public static void DisplayReverse(Stack s) throws Exception {
		if (s.isEmpty()) {
			return;
		}

		int temp = s.pop();
		DisplayReverse(s);
		System.out.println(temp);

		s.push(temp);

	}

	public static void ActualReverse(Stack s, Stack helper) throws Exception {
		if (s.isEmpty()) {
			ActualReverseHelper(s, helper);
			return;
		}

		int temp = s.pop();
		helper.push(temp);
		ActualReverse(s, helper);

	}

	public static void ActualReverseHelper(Stack s, Stack helper) throws Exception {
		if (helper.isEmpty()) {
			return;
		}

		int temp = helper.pop();
		ActualReverseHelper(s, helper);
		s.push(temp);

	}

	public static void NextGreaterElement(int[] arr) {

		java.util.Stack<Integer> s = new java.util.Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > s.peek()) {
				System.out.println(s.pop() + "->" + arr[i]);

			}
			s.push(arr[i]);

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "->" + -1);

		}

	}

	public static int[] NextGreaterElement2(int[] arr) {

		int[] ans = new int[arr.length];

		java.util.Stack<Integer> s = new java.util.Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				ans[s.pop()] = arr[i];

			}
			s.push(i);

		}
		while (!s.isEmpty()) {

			ans[s.pop()] = -1;
		}
		return ans;
	}

	public static int[] StockSpan(int[] arr) {

		int[] ans = new int[arr.length];

		java.util.Stack<Integer> s = new java.util.Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();

			}
			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}

			s.push(i);
		}

		return ans;

	}

}

package Lecture_10;

public class Recursion_demo {

	public static void main(String[] args) {
		System.out.println(fun2(4, 3));
	}

	public static int fun(int n) {
		if (n == 4)
			return n;
		int ans = 2 * fun(n + 1);
		return ans;
	}

	public static int foo(int x, int y) {
		if (x == 0) {
			return y;
		}
		int ans = foo(x - 1, x + y);
		return ans;
	}

	public static void fun1(int n) {
		if (n == 0)
			return;
		System.out.println(n % 2);
		fun1(n / 2);
	}

	public static int fun2(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return fun2(a * a, b / 2);

		return fun2(a * a, b / 2) * a;

	}
}
package Lecture_9;

public class PI_PDbyRecursion {
	
	
	public static void main(String[] args) {
		PD(3);
		PI(3);
	}
	
	public static void PD(int n) {

		if (n == 0) {
			return;
		}

		System.out.println("hi " + n);

		PD(--n);

		System.out.println("bye " + n);

	}

	public static void PI(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// smaller problem
		PI(n - 1);

		// how to make the result of sp to bp : self work
		System.out.println(n);

	}

}

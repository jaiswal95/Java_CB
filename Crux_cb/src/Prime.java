import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int count = 2;
		int flag = 0;

		while (count <= n-1 ) {
			if (n % count == 0) {
				System.out.println("This is not a prime");
				flag = 1;
				break;
			}

			count++;

		}
		if (flag == 0) {
			System.out.println("This number is prime.");
		}

	}
}
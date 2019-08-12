import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int flag = 0;

		int div = 2;

		while (div <= n - 1) {

			if (n % div == 0) {
				flag = 1;
			}

			div = div + 1;
		}

		if (flag == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		System.out.print("Enter the Value of n: ");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int count = 1;
		int sum = 0;
		while (count <= n) {
			sum = sum + count; // sum+=count
			count++;

		}
		System.out.println(sum);

	}

}

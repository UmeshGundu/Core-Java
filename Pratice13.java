/*program to display fibonacci series
 */

import java.util.Scanner;

public class Pratice13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number term to display the fibonacci ");
		int n = scan.nextInt();
		printfibonacci(n);

	}

	private static void printfibonacci(int n) {
		int firstterm = 0;
		int secondterm = 1;
		int thirdterm = 0;
		if (n == 1) {
			System.out.println(firstterm);
			return;
		}
		if (n == 2) {
			System.out.println(firstterm);
			System.out.println(secondterm);
			return;
		}
		System.out.println(firstterm);
		System.out.println(secondterm);
		for (int i = 3; i <= n; i++) {
			thirdterm = firstterm + secondterm;
			System.out.println(thirdterm);
			firstterm = secondterm;
			secondterm = thirdterm;

		}

	}
}
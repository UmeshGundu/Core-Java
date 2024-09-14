/*
 * write 
 */

import java.util.Scanner;

public class Pratice15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value x");
		int x = scan.nextInt();
		System.out.println("Enter the value y");
		int y = scan.nextInt();
		rangeOfPrimes(x, y);
	}

	private static void rangeOfPrimes(int x, int y) {
		System.out.println("The range of primes :(" + x + "," + y + ")");
		for (int i = x; i <= y; i++) {
			for (int j = 2; j <= Math.sqrt(j); j++) {
				if (i % j == 0) {
					break;

				}
				System.out.println(i);

			}
			

		}
	}
}

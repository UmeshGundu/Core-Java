/*
 *take a number from user multiply itself(result) and if sum of individual digits of the result = given number.
 *ex:9
 *   9*9=81;
 *   81=>8+1=9
 *   given number is 9;
 */

import java.util.Scanner;

public class neonNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = scan.nextInt();
		int b = a * a;
		System.out.println(b);
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum = sum + b % 10;

		}

		if (sum == a)
			System.out.println("It is a Neon number : " + sum);
		else
			System.out.println("Not a Neon number : " + sum);
	}
}
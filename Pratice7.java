/*
 * write a program to display a table
 */

import java.util.Scanner;

public class Pratice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value ");
		int n = sc.nextInt();
		printtable(n);
   }
	    private static void printtable(int n) {
		int table = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println(+n + "*" + i + "=" + n * i);

		}

	}

}

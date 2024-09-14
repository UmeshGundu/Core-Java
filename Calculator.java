import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a");
		int a = scan.nextInt();
		System.out.println("b");
		int b = scan.nextInt();
		System.out.println("enter a operator");
		String c = scan.next();

		switch (c) {
		case "*":
			multiplication(a, b);
			break;
		case "/":
			division(a, b);
			break;
		case "+":
			addition(a, b);
			break;
		case "-":
			substraction(a, b);
			break;

		}
	}

	private static void substraction(int a, int b) {
		int result = a - b;
		System.out.println("substraction : " + result);
	}

	private static void addition(int a, int b) {
		int result = a + b;
		System.out.println("addition : " + result);
	}

	private static void division(int a, int b) {
		int result = a / b;
		System.out.println("Division : " + result);
	}

	private static void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("multiplication : " + result);

	}

}

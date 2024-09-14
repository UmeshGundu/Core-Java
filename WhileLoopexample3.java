import java.util.Scanner;

public class WhileLoopexample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		System.out.println("Enter b value");
		int b = scan.nextInt();

		for (int i = a; i <= a; i++)
			;
		RangeOfArmstrong(a, b);

	}

	private static void RangeOfArmstrong(int a, int b) {
		int temp = a;
		int sum = 0;
		String str = String.valueOf(a);
		int len = str.length();
		while (a > 0) {
			int d = a % 10;
			sum += (int) Math.pow(a, b);
			a = a / 10;
		}

	}
}
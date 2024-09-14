import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = scan.nextInt();
		int n1=n;
		SpyNumber(n,n1);

	}

	private static void SpyNumber(int n,int n1) {
		int sum = 0;
		int mul =1;
		if (n == 0) {
			System.out.println("Please enter a proper number");
			System.exit(0);
		}
		while (n > 0) {

			int digit = n % 10;
			int digit1 = n1 % 10;    
			mul *= digit1;
			sum += digit;
			n1 = n1 / 10;
			n = n / 10;
		}
		System.out.println(sum);
		System.out.println(mul);
		if (sum == mul)
			System.out.println("It is a spy number");
		else
			System.out.println("It is not a spy number");

	}
}
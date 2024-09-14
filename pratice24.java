import java.util.Scanner;

public class pratice24 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the term value");
		int n = scan.nextInt();
		series(n);
	}

	private static void series(int n) {
		int firstNumber = 0;
		int secondNumber = 1;
		if (n == 1) {
			System.out.println(firstNumber);
			return;
			
		}
		if (n == 2) {
			System.out.println(firstNumber);
			System.out.println(secondNumber);
			System.exit(secondNumber);
			return;
		}
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		while(n>3){
			int nextTerm = firstNumber + secondNumber;
			System.out.println(nextTerm);
			firstNumber = secondNumber;
			secondNumber = nextTerm;
		}
	}
}

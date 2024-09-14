import java.util.Scanner;

public class  sumOfThree{
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();

		int sumOfThree = a + b + c;
		System.out.println(sumOfThree + "= Result");

	}
}

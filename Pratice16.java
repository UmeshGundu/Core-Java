import java.util.Scanner;

public class Pratice16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value to print pattern");
		int n=scan.nextInt();
		printPattern(n);
		
	}

	private static void printPattern(int n) {
                for(int i=1;i<=n;i++) {
                	for(int j=1;j<=i;j++) {
                		System.out.print("$"+" ");
                	}
                	System.out.println();
                }
	}

}

import java.util.Scanner;

public class Pratice21 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the term value");
		int n = scan.nextInt();
		printPattern(n);

	}

	private static void printPattern(int n) {
               for(int i=1;i<=n;i++) {
            	   for(int j=1;j<=2*(n-i);j++) {
            		   System.out.print(" ");
            	   }
            	   for(int k=1;k<=2*i-1;k++) {
            		   System.out.print("$"+" ");
            	   }
            	   System.out.println();
               }
	}

	
}

import java.util.Scanner;

public class Pratice12 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sca.nextInt();
		printpattern(n);

	}

	private static void printpattern(int n) {
           for(int i=1;i<=n;i++) {
        	   for(int j=n;j<=i;j--) {
        		   System.out.print("*"+ "  ");
        	   }
        	   System.out.println();
           }
	}

}

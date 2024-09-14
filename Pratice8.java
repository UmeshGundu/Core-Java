import java.util.Scanner;

public class Pratice8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();

		isprime(n);

	}

	private static void isprime(int n) {
           
           for(int i=2;i<=n;i++) {
        	   if(n%i==0) {
        		   System.out.println(i+" :is a prime number");
        		   
        	   }
        	   else
        		   System.out.println(i+" :not a prime");
        	   
        	   
        	   
           }
}}
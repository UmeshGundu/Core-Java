
/*
 * write a program for n perfect numbers
 */
import java.util.Scanner;

public class Pratice14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value ");
		int n = scan.nextInt();
		printperfect(n);
	}

	private static void printperfect(int n) {
           int sum=0;
           for(int i=1;i<=n/2;i++) {
        	   if(n%i==0) {
        	   sum+=i;}
        	   
           }
           if(sum==n) {
        	   System.out.println("It is a perfect number :"+sum);
        	   
           }
           else {
        	   System.out.println("It is not a perfect number :"+sum);
           }
	}
}

/*
 * write sum of even and odd at an 'n' natural numbers 
 */

import java.util.Scanner;

public class Pratice6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 'n' natural numbers");
		int n=sc.nextInt();
		evenoddnaturalsum(n);
	}

	private static void evenoddnaturalsum(int n) {
            int evensum=0;
            int oddsum=0;
            for(int i =1;i<=n;i++) {
            	if(i%2==0) {
            		evensum+=i;
            	}
            	else
            		oddsum+=i;
            }
            System.out.println("The sum of even natural numbers are :"+evensum);
            System.out.println("The sum of odd natural numbers are :"+oddsum);
	}

}

import java.util.Scanner;

public class PalindromeRange {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter X value");
	 int X=scan.nextInt();
	 System.out.println("Enter Y value");
	 int Y =scan.nextInt();
	 RangePalindrome(X,Y);
	 int temp=0;
	 for (int i=X;i<=Y;i++) {
		 while(X>0) {
			 int d=X%10;
			 temp=temp*10+d;
		 }
		
		 System.out.println(X+":is an palindrome");
			}
	 
 }

private static void RangePalindrome(int X, int Y) {
	
	
}
}

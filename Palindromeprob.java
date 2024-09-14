import java.util.Scanner;
public class Palindromeprob {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scan.nextInt();
		FindPalindrome(a);
		}

	private static void FindPalindrome(int a) {
         int temp=a;
         int sum=0;
         while(a>0) {
         int d=a%10;
         sum=sum*10+d;
         a=a/10;
      }
         if(sum==temp)
        	 System.out.println(sum+": is an palindrome");
         else
        	 System.out.println(sum+": is not an palindrome");
		  
	}

}

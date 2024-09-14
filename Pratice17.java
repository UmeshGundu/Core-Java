import java.util.Scanner;

public class Pratice17 {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the value to print pattern");
	 int n=scan.nextInt();
	 printpattern(n);
	 
 }

private static void printpattern(int n) {
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=n-i+1;j++) {
        	 System.out.print("$"+" ");
        	
        	 }
        	 System.out.println();
         }
}
}

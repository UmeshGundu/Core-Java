import java.util.Scanner;

public class pratice23 {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the value");
	 int n=scan.nextInt();
	 printpattern(n);
 }

private static void printpattern(int n) {
           for(int i=1;i<=n;i++) {
            	 for(int j=1;j<=2*(i-1);j++) {
            		 System.out.print(" ");
            	 }
            	 for(int k=1;k<=n-i+1;k++) {
            		 System.out.print("$"+" ");
            	 }
            	 System.out.println();
             }
}
}

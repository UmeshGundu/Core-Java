import java.util.Scanner;

public class Pratice {
 public static void main(String[] args) {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter the Number");
	  
	 int n=scan.nextInt();
	 findevenorodd(n);
	 }
 private static void findevenorodd(int n) {
   
	  if(n%2==0) {
		  System.out.println("The given number is EVEN :"+n);}
		  else 
			  System.out.println("The given number is ODD :"+n);
	  
}
}

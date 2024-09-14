import java.util.Scanner;

public class Pratice10 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 System.out.println("Enter the number");
	 int b=sc.nextInt();
	 rangeofprimes(a,b);
	 
 }

private static void rangeofprimes(int a, int b) {
          for(int i=a;i<=b;i++) {
        	  boolean flag=true;
        	  for(int j=2;j<i;j++) {
        		  if(i%j==0)
        	         break; 
        		  else 
        			  System.out.println();
        	  }
        	  if(flag==true)
        		  System.out.println(i+"is prime");
        	  else
        		  System.out.println(i+"is not prime");
          }
}
}

import java.util.Scanner;

public class  Pratice19{
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=scan.nextInt();
		printPattern(a);
		
	}

	private static void printPattern(int a) {
      for(int i=1;i<=a;i++) {
    	  for(int j=1;j<=2*(a-i);j++) {
    		  System.out.print(" ");
    	  }
    	  for(int k=1;k<=2*i-1;k++) {
    		  System.out.print("$"+" ");
    	  
    	  }
    	  System.out.println();
      }
	}
}
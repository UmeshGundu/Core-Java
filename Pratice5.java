import java.util.Scanner;

public class Pratice5 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value of natural numbers");
		int n=scan.nextInt();
		
		naturalsum(n);
}

	private static void naturalsum(int n) {
		    int sum=0;
             for(int i=1;i<=n;i++) {
            	  sum+=i;
            	 
            	 
             }
             System.out.println("Sum of natural numbers are :"+sum);
	}

}

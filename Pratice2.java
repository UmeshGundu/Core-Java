import java.util.Scanner;
public class Pratice2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number : a");
		int a =scan.nextInt();
		System.out.println("Enter a number : b");
		int b =scan.nextInt();
		
		FindTheSolution(a,b);
	}
	private static void FindTheSolution(int a, int b) {
            if(a==b) {
            	int c=a+b;
            	System.out.println("Sum :"+c);
            }
            else{
            	int d=(a+b)*2;
            	System.out.println("Result :"+d);
  	
            }
	}

}

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
 	   System.out.println("Enter n value");
 	   int n =scan.nextInt();
 	   PrintPattern(n);
 	   
	}

	private static void PrintPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
	}

}

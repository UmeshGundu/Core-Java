
import java.util.Scanner;

public class WhileLoopExamples{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		SumOfThreeNumbers(num);
		}
        private static void SumOfThreeNumbers(int num) {
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum+=d;
			num=num/10;
			}
		System.out.println("The sum of three digit value :"+sum);
	}
}
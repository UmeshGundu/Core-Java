import java.util.Scanner;
public class WhileLoopExample2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		FindAmrstrongNumber(num);
	}

	private static void FindAmrstrongNumber(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp=num;
		String str=String.valueOf(num);
		int len= str.length();
		while(num>0) {
			int d=num%10;
			sum+=(int)Math.pow(d, len);
			num=num/10;
		}
		
		
		
		
		  if(sum==temp)
			  System.out.println(sum+": is an amrstrong number");
		  else
			  System.out.println(sum+": is not an amrstrong number");
		  
		
		
		
	}
	

}

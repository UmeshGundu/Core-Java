import java.util.Scanner;

public class practice{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
	   int a=scan.nextInt();
	   
	    if(a%3==0) {
		   System.out.println("Zip");
	   }
	   
	   else if(a%5==0){
	   System.out.println("zap");
	   
	   }
	   else if(a%3==0 && a%5==0) {
		   System.out.println("Hurray");
	   }
	    
	   else
		   System.out.println("IT is not divisible by both number");
		   
	      
	  
	}
}
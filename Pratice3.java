import java.util.Scanner;
public class Pratice3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a= sc.nextInt();
		
		findAnswer(a);
}

	private static void findAnswer(int a) {
           if(a%3==0&& a%5==0) 
        	   System.out.println("Hurray..! your number is divisible :"+a+" is divible to both 3,5");
        	  
           
           else if(a%5==0) {
        	   System.out.println("Woahh...!"+a+ " is divisible to 5");
        	    }
           else if(a%3==0) {
        	   System.out.println("WOW..."+a+" is divisible to 3");
             }
           else
        	   System.out.println("Oops..."+a+" is not divisible to any value");
           
	}

}

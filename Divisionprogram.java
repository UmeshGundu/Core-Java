import java.util.Scanner;

public class Divisionprogram {
 public static void main(String[] args) {
	System.out.println("Enter 'a' value");
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	System.out.println("Enter 'b' value");
	int b=sc.nextInt();
	 int div=a/b;
	 int mod=a%b;
	 
	 System.out.println("division="+div);
	 System.out.println("modulus="+mod);
	
}
}

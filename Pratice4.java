import java.util.Scanner;

public class Pratice4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the Username...");
		String username=sc.nextLine();
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		checkuser(username,password);
}

	private static void checkuser(String username, String password) {
              if(username.equalsIgnoreCase("umesh") && password.equalsIgnoreCase("Umesh@66")) {
            	  System.out.println("Login Successful...!");}
            	  else 
            		  System.out.println("Login Failed");
            	  
              
	}
}
import java.util.Scanner;

public class RotationString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = scan.nextLine();
		System.out.println("Enter the string");
		String str2 = scan.nextLine();
		rotationString(str1, str2);
	}

	private static void rotationString(String str1, String str2) {
           if(str1.length()==str2.length()) {
        	   if((str1+str1).indexOf(str2)!=-1) {
        	   System.out.println("str1 is a rotation of str2");
        	   
        	   }
        	   else
        		   System.out.println("str2 is not a rotation of str1");
           }
	}
}

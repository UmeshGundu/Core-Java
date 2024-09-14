import java.util.Scanner;

public class SwapTwoStrings{
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("str1: ");
		String str1=sc.nextLine();
		System.out.println("str2: ");
		String str2=sc.nextLine();
		SwapStrings(str1,str2);
	}

	private static void SwapStrings(String str1, String str2) {
              str1=str1+str2;
              str2=str1.substring(0,str1.length()-str2.length());
              str1=str1.substring(str2.length());
              System.out.println("str1: "+str1);
              System.out.println("str2: "+str2);
	}
}
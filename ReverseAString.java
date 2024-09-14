import java.util.Scanner;

public class ReverseAString{
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		reverseString(str);
		
	}

	private static void reverseString(String str) {
          String[] words=str.split(" ");
          String newstr="";
          for(int i=0;i<words.length;i++) {
        	  String temp=words[i];
        	  String rev="";
        	  for(int j=temp.length()-1;j>=0;j--) {
        		  rev=rev+temp.charAt(j);
        		  
        	  }
        	  newstr=newstr+rev+" ";
          }
          System.out.println(newstr);
	}
}
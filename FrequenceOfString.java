import java.util.Arrays;
import java.util.Scanner;

public class FrequenceOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		StringFrequence(str);
	}

	private static void StringFrequence(String str) {
               str.toLowerCase();
               char[] ch=str.toCharArray();
               Arrays.sort(ch);
               for(int i=0;i<ch.length-1;i++) {
            	   int count =1;
            	   for(int j=i+1;j<ch.length;j++) {
            		    
            		   if(ch[i]==ch[j]) {
            			   count++;
            			   }              //program is in pending.
            		   else {
            			   i=j-1;
            		   break;}
            		   
            	   }
            	   System.out.println(ch[i-1]+"-"+count);

               }
               
               
	
}
	}

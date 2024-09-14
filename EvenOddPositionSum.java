import java.util.Scanner;

public class EvenOddPositionSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		isFindEvenOddSumPosition(number);
		
	}

	private static void isFindEvenOddSumPosition(int number) {
              String str=String.valueOf(number);
              int len=str.length();
              
              int evenpositionsum=0;
              int oddpositionsum=0;
              
              boolean isevenposition=false;
              
              if(len%2==0) {
            	  isevenposition=true;
            	  
              }
              
              while(number>0) {
            	  int d=number%10;
            	  if(isevenposition) {
            		  evenpositionsum=evenpositionsum+d;
            		  isevenposition=!isevenposition;
            		  
            	  }
            	  else {
            		  oddpositionsum=oddpositionsum+d;
            		  isevenposition=!isevenposition;
            		  
            	  }
            	  
            	  number=number/10;
            	  
              }
              
              System.out.println("sum of even position digits :"+evenpositionsum);
              
              System.out.println("sum of odd position digits :"+oddpositionsum);
              
              
	}

}

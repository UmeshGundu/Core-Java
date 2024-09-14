import java.util.Arrays;

public class duplicatearrays {
       public static void main(String[]args) {
    	   int[] arr= {3,1,4,2,1,3,5,3,4,3,4,2,5,6,7,8,4,5,9,8,6,4,2,34,5,6,67,322,4,66,732 };
    	    removeduplicates(arr); 
    	   }

	private static void removeduplicates(int[] arr) {
		     Arrays.sort(arr);
		     int i=0;
		     for (int j=1;j<arr.length;j++) {
		    	 if (arr[i]!=arr[j]) {
		    		 i++;
		    		 arr[i]=arr[j];
		    		 
		    	 }
		     }
		     for(int k=0;k<=i;k++) {
		    	 System.out.print(arr[k]+"  ");
		     }
		     
		     
	}
}


public class Selectionsort {
	public static void main (String[] agrs) {
		
		int[] arr= {2,8,3,4,2,6,7};
		
		selectionsorting(arr);
	}

	private static void selectionsorting(int[] arr) {
		
              for(int i=0;i<arr.length-1;i++) {
            	  int mini=i;
            	  for(int j=i+1;j<arr.length;j++) {
            		  if(arr[j]<arr[mini]) {
            			  mini=j;
                     }
            		   int temp=arr[i];
            		   arr[i]=arr[mini];
            		   arr[mini]=temp;
            	  }
            	  }
            	  for(int i=0;i<arr.length;i++) {
                           System.out.print(arr[i]+"  ");
            		
            	  }
              
	}

}

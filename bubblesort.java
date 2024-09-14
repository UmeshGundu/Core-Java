
public class bubblesort {
    public static void main(String[] args) {
    	int[] arr= {3,4,6,6,8,4,2,3,4,6,9,7,3,44,556};
    	bubblesort(arr);
    }

	private static void bubblesort(int[] arr) {
             for(int i=arr.length-1;i>=0;i--) {
            	 for(int j=0;j<=i-1;j++) {
            		 if(arr[j]>arr[j+1]) {
            			 int temp=arr[j];
            			 arr[j]=arr[j+1];
            			 arr[j+1]=temp;
            			 
            			 
            		 }
           
            	 }
             }
             for(int j=0;j<arr.length;j++) {
            	 System.out.print(arr[j]+"  ");
            	 
             }
             
	}
}

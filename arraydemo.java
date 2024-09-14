import java.util.Scanner;
public class arraydemo{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element at an index:"+i);
			arr[i]=scan.nextInt();
		}
		findsumofindex(arr);
	}

	private static void findsumofindex(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			
			
		}
		System.out.println("the sum of array values are:"+sum);
            		
	}
	
}
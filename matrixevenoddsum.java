import java.util.Scanner;

public class matrixevenoddsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();

		int[][] arr = new int[rows][columns];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter elements at=(" + i + "," + j + ")");
				arr[i][j] = sc.nextInt();

			}
		}
		evenoddmatrix(arr);
	}

	private static void evenoddmatrix(int[][] arr) {
		int evensum = 0;
		int oddsum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					evensum += arr[i][j];
				} else
					oddsum += arr[i][j];

			}
		}
		System.out.println("the sum of even numbers :"+evensum);
		System.out.println("the sum of odd numbers :"+oddsum);
	}
}
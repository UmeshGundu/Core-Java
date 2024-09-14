import java.util.Scanner;

public class diagonalmatricaddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the number of cols");
		int cols = scan.nextInt();

		int[][] arr = new int[rows][cols];
		if (rows != cols) {
			System.out.println("The Diagonal doesn't exist for this matrix");
			System.exit(0);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element numbers at :(" + i + "," + j + ")");
				arr[i][j] = scan.nextInt();

			}
		}
		diagonalsum(arr);

	}

	private static void diagonalsum(int[][] arr) {
		int left_diagonalsum = 0;
		int right_diagonalsum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					left_diagonalsum += arr[i][j];
				}
				if (i + j == arr.length - 1) {
					right_diagonalsum += arr[i][j];

				}
			}
		}
		System.out.println("The sum of left diagonal numbers are :" + left_diagonalsum);
		System.out.println("The sum of right diagonal numbers are :" + right_diagonalsum);
	}

}

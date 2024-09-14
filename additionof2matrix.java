public class additionof2matrix{
	public static void main(String[]args) {
		int[][] matrix1= {{2,3},{5,4},{6,5}};
		int[][] matrix2= {{5,4},{3,7},{7,9}};
		
		additionmatrix(matrix1,matrix2);
		
	}

	private static void additionmatrix(int[][] matrix1, int[][] matrix2) {
		int[][] matrix3=new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				 matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
				 
				
			}
		}
		for(int i=0;i<matrix3.length;i++) {
			for (int j=0;j<matrix3[i].length;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
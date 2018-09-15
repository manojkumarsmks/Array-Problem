
public class TransposeMatrix {

	public static void main(String[] args) {
		int A[][] = {{1,2,3}, {4,5,6}};
		
		transpose(A);
	}
	
	public static int[][] transpose(int[][] A) {
		
		int [][] result = new int[A[0].length][A.length];
		
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				result[j][i] = A[i][j];
			}
		}
		
		
		
		return A;
	}

}

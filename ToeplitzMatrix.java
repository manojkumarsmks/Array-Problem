// https://leetcode.com/problems/toeplitz-matrix/description/
import java.util.HashMap;
import java.util.Map;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		
		int[][] inputMatrix = {{1,2}, {2,2}};
		
		System.out.println(checkForToeplitzMatrix(inputMatrix));
		
	}
	
	public static boolean checkForToeplitzMatrix(int[][] matrixInput) {
		// row1-column1 == row2-column2 is the logic for dialgonal 
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < matrixInput.length; i++) {
			for (int j = 0; j < matrixInput[i].length; j++) {
				if(map.containsKey(i-j)) {
					if(map.get(i-j) != matrixInput[i][j])
						return false;
				}
				else {
					map.put((i-j), matrixInput[i][j]);
				}
					
			}
		}
		
		return true;
	}

}

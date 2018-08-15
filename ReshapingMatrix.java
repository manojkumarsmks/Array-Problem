// https://leetcode.com/problems/reshape-the-matrix/description/
import java.util.LinkedList;
import java.util.Queue;

public class ReshapingMatrix {

	public static void main(String[] args) {
		int[][] nums = {{1,2},{3,4}};
		int r = 1, c =4;
		
		matrixReshape(nums, r, c);
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		
		if((r*c) != (nums.length *nums[0].length))
			return nums;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int[][] matrix = new int[r][c];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				queue.add(nums[i][j]);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = queue.poll();
			}
		}
		
		return matrix;
	}
}

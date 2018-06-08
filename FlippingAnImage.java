//https://leetcode.com/problems/flipping-an-image/description/
public class FlippingAnImage {
	
	public int[][] flipAndInvert(int[][] inputData) {
		
		for (int i = 0; i < inputData.length; i++) {
			for (int j = 0; j < inputData[i].length/2; j++) {
				int temp = inputData[i][j];
				inputData[i][j] = inputData[i][inputData.length-j-1];
				inputData[i][inputData.length-j-1] = inputData[i][j];
			}
		}
		
		for (int i = 0; i < inputData.length; i++) {
			for (int j = 0; j < inputData[i].length/2; j++) {
				if(inputData[i][j] == 0)
					inputData[i][j] = 1;
				else
					inputData[i][j] = 0;
			}
		}
		
		return inputData;
	}
}

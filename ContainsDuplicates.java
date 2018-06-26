// https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicates {

	public static void main(String[] args) {
		int[] input = {3,1};
		System.out.println(checkForDuplicatesBruteForce(input));
	}
	
	// Brute force method 
	public static boolean checkForDuplicatesBruteForce(int[] inputArray) {
		
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[i] == inputArray[j])
					return true;
			}
		}
		return false;
	}

}

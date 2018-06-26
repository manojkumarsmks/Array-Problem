// https://leetcode.com/problems/contains-duplicate/description/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int[] input = {1,2,3,1};
		System.out.println(checkUsingMaps(input));
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
	
	// Sort and check if two consecutive indexes are same 
	public static boolean checkBySorting(int[] inputArray) {
		Arrays.sort(inputArray);
		
		for (int i = 0; i < inputArray.length-1; i++) {
			if(inputArray[i] == inputArray[i+1])
				return true;
		}
		return false;
		
	}
	
	// Using set to check if the element exists
	public static boolean checkUsingMaps(int[] inputArray) {
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if(set.contains(inputArray[i]))
				return true;
			else {
				set.add(inputArray[i]);
			}
		}
		return false;
	}

}

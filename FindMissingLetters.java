// https://leetcode.com/problems/find-all-numbers-missing-in-an-array/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingLetters {

	public static void main(String[] args) {
		int[] array = {4,3,2,7,8,2,3,1};
		List<Integer> result = missingNumbers(array);
		
		//System.out.println(result.size());
		for (Integer integer : result) {
			System.out.println(integer);
		}
		
	}
	
	// Space Complexity - O(n)
	// Time Complexity - O(1)
	public static List<Integer> findMissingNumbers(int[] nums) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		boolean[] bool = new boolean[nums.length];
		Arrays.fill(bool, false);
		
		for (int i = 0; i < bool.length; i++) {
			bool[nums[i]-1] = true;
		}
		
		for (int i = 0; i < bool.length; i++) {
			if(!bool[i]) 
				result.add(i+1);
		}
		
		return result;	
	}
	
	// Time Complexity - O(n)
	// Space Complexity - O(1)
	public static List<Integer> missingNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[Math.abs(nums[i])-1] > 0) 
				nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];	
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] >0) 
				result.add(i+1);
		}
		return result;
	}
	
	

}

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		int[] array = {4,3,2,7,8,2,3,1};
		List<Integer> result = findDisappearedNumbers(array);
		for (Integer integer : result) {
			System.out.println(integer);
		}
		
	}
	
	// Space Complexity - O(n)
	// Time Complexity - O(1)
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		
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

}

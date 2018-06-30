import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindAllDuplicateElements {

	public static void main(String[] args) {
		int[] inputArray = {4,3,2,7,8,2,3,1};
		List<Integer> result = findAllDuplicateElements(inputArray);
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	private static List<Integer> findAllDuplicateElements(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[Math.abs(nums[i])-1] < 0)
				result.add(Math.abs(nums[i]));
			else 
				nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
		}
		
		return result;
	}

}

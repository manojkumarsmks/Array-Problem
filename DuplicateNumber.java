// https://leetcode.com/problems/find-the-duplicate-number/description/
public class DuplicateNumber {

	public static void main(String[] args) {
		int[] inputArray = {1,3,4,2,2};
		
		System.out.println(findDuplicateNumber(inputArray));

	}

	private static int findDuplicateNumber(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[Math.abs(nums[i])-1]<0) {
				return nums[i];
			}
			nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
		}
		
		return -1;
	}

}

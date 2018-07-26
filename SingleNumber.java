// https://leetcode.com/problems/single-number/description/
public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		
		System.out.println(findTheSingleNumber(nums));

	}

	private static int findTheSingleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		
		return result;
	}

}

// https://leetcode.com/problems/array-partition-i/description/
import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
		
		int[]  nums =  {1,4,3,2};
		
		System.out.println(arrayPairSum(nums));
	}
	
	public static int arrayPairSum(int[] nums) {
		
		Arrays.sort(nums);
		int total = 0;
		for (int i = 0; i < nums.length; i= i+2) {
			total += nums[i];
		}
		
		return total;
	}

}

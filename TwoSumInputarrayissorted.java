// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumInputarrayissorted {

	public static void main(String[] args) {
		int[] input = {2,7,11,15};
		int target = 9;
		
		int[] result = twoSum(input, target);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        // increment the left if the sum is smaller than the targer
        // or decrement the right
        while(left<right) {
        	if(numbers[left] + numbers[right] == target)
        		return new int[]{left+1, right+1};
        	
        	else if(numbers[left] +numbers[right] < target)
        		left++;
        	
        	else
        		right--;
         }
        
        return new int[] {};
    }

}

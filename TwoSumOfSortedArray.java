// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumOfSortedArray {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;
		
		int[] result = twoSum(numbers, target);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int low = 0, end  = numbers.length -1;
		int[] result = new int[2];
		
		while(low < end) {
			if((numbers[low] + numbers[end])== target) {
				result[0] = low;
				result[1] = end;
				break;
			}
			else if((numbers[low] + numbers[end])> target)
				end--;
			else 
				low++;
		}
		return result; 
        
    }

}

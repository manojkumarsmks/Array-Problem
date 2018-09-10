import java.util.Arrays;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
public class AtleastTwiceOfOthers {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		System.out.println(dominantIndex(nums));
	}
	
    public static int dominantIndex(int[] nums) {
    	int[] temp = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(temp);
    	int max = temp[temp.length-1];
    	
    	for (int i = 0; i < nums.length-1; i++) {
    		if((temp[i]*2) > max)
    			return -1;
		}
    	
    	for (int i = 0; i < nums.length; i++) {
			if(max == nums[i])
				return i;
		}
    	
    	return -1;
        
    }

}

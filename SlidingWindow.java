// https://leetcode.com/problems/sliding-window-maximum/description/#

public class SlidingWindow {

	// Time complexity is O(nk)
	// Brute force method
	// We can use deque and do it better - Still learning ;)
	public static int[] slidingWindowMax(int[] input, int k) {
		
		int[] result = new int[input.length-k+1];
		int resultIndex =0;
		
		for (int i = 0; i < result.length; i++) {
			int max = Integer.MIN_VALUE;
			
			for (int j = i; j < i+k; j++) {
				if(max < input[j])
					max = input[j];
			}
			
			result[resultIndex] = max;
			resultIndex++;
			
		}
		
		return result;
	}

}

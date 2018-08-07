// https://leetcode.com/problems/container-with-most-water/description/
public class MaxWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(maxAreaBetterApproach(height));
	}
	
	// O(n^2) Answer
	public static int maxArea(int[] height) {
        int max = -1;
        
        for (int i = height.length-1; i > 0; i--) {
        	for (int j = 0; j < height.length-2; j++) {
				
        		int min = Math.min(height[i], height[j]);
        		System.out.println(min);
        		if((min * (i-j)) > max)
        			max = min*(i-j);
        		
			}
		}
        
        return max;
    }
	
	// twoPoiner Approach
	public static int maxAreaBetterApproach(int[] height) {
		int max = -1;
		int startPointer = 0, endPointer = height.length-1;
		
		while(startPointer < endPointer) {
			//int min = Math.min(height[startPointer], height[endPointer]);
			if((Math.min(height[startPointer], height[endPointer]) *(endPointer-startPointer)) >max)
				max = (Math.min(height[startPointer], height[endPointer]) *(endPointer-startPointer));
			
			if(height[startPointer]<height[endPointer])
				startPointer++;
			else
				endPointer--;
		}
		
		return max;
	}

}

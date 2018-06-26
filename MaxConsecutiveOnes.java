// https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] array = {1,1,0,1,1,1}; 
		System.out.println(MaxConsecutive(array));
	}

	private static int MaxConsecutive(int[] array) {
		int consecutiveCount = 0;
		int tempCounter = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] ==  1)
				tempCounter++;
			else if(array[i] == 0) {
				
				if(tempCounter > consecutiveCount)
					consecutiveCount = tempCounter;
				tempCounter = 0;
			}
		}
		
		if(tempCounter > consecutiveCount)
			consecutiveCount = tempCounter;
		return consecutiveCount;
	}

}

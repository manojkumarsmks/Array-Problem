// https://leetcode.com/problems/teemo-attacking/description/
public class TeemoAttacking {

	public static void main(String[] args) {
		int[] timeSeries = {1};
		int duration = 2;
		
		System.out.println(timeSeries.length);
		//System.out.println(findPoisonedDuration(timeSeries, duration));
	}
	
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0)
            return 0;
        if(timeSeries.length == 1)
            return duration;
        
		int firstPointer = 0;
		int secondPointer = 1;
		int totalDuration = 0;
		while(secondPointer <= timeSeries.length-1) {
			
			if(Math.abs(timeSeries[firstPointer] - timeSeries[secondPointer]) < duration) {
				totalDuration += Math.abs(timeSeries[firstPointer] - timeSeries[secondPointer]);
			}
			else {
				totalDuration += duration;				
			}
			firstPointer++;
			secondPointer++;
			
		}
		return totalDuration+duration;
				

	}

}

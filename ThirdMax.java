// https://leetcode.com/problems/third-maximum-number/description/
public class ThirdMax {

	public static void main(String[] args) {
		
		int[] inputArray = {2, 2, 3, 1};
		System.out.println(thirdMax(inputArray));

	}

	private static int thirdMax(int[] inputArray) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
		
		loop: for (int i = 0; i < inputArray.length; i++) {
			
			if(inputArray[i] == firstMax || inputArray[i] == secondMax || inputArray[i] == thirdMax)
				continue loop;
			if(inputArray[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = inputArray[i];
			}
			else if(inputArray[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = inputArray[i];
				
			}
			else if(inputArray[i] > thirdMax) {
				thirdMax = inputArray[i];
			}
			
		}
		
		
		if(firstMax != Integer.MIN_VALUE) {
			return firstMax;
		}
		if(secondMax != Integer.MIN_VALUE) {
			return secondMax;
		}
		return thirdMax;
	}

}

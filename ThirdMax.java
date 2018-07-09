// https://leetcode.com/problems/third-maximum-number/description/
public class ThirdMax {

	public static void main(String[] args) {
		
		int[] inputArray = {1,2};
		System.out.println(thirdMax(inputArray));

	}

	private static int thirdMax(int[] inputArray) {
		Integer firstMax = null, secondMax = null, thirdMax = null;
		
		loop: for (Integer n:inputArray) {
				
				if(n.equals(firstMax)|| 
						n.equals(secondMax) || 
						n.equals(thirdMax))
					continue loop;
				if(firstMax == null || n > firstMax) {
					thirdMax = secondMax;
					secondMax = firstMax;
					firstMax = n;
				}
				else if(secondMax == null || n > secondMax) {
					thirdMax = secondMax;
					secondMax = n;
					
				}
				else if(thirdMax == null || n > thirdMax) {
					thirdMax = n;
				}
				
			}
			
			if(thirdMax != null) {
				return thirdMax;
			}
			return firstMax;
	}

}

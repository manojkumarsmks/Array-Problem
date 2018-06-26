// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {

	public static void main(String[] args) {
		int[] inputArray = {6,6,6,7,7};
		
		System.out.println(returnCandidate(inputArray));
	}
	
	// Implementation of the  Boyer-Moore Voting Algorithm
	public static int returnCandidate(int[] inputArray) {
		// Two variables reprenting the maxmum occuring element and counter
		int candidate = 0, counter = 0;
		
		// If counter = 0, assing the current array index to the canditate 
		//  and increment counter;
		// else decrement the counter unless the current array element is same as the candidate
		
		for (int i = 0; i < inputArray.length; i++) {
			
			if(counter == 0) {
				candidate = inputArray[i];
				counter++;
			}
			else { 
				if(inputArray[i] == candidate)
					counter++;
				else
					counter--;
			}
			System.out.println("Counter "+counter +" candidate "+candidate);
		}
		
		return doubleCheckCandidate(inputArray, candidate);
	}
	
	// double checking the existence of number of element 
	public static int doubleCheckCandidate(int[] inputArray, int candidate) {
		
		int counter = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			if(candidate == inputArray[i])
				counter++;
		}
		
		if(counter >= (inputArray.length/2))
			return candidate;
		
		return Integer.MIN_VALUE;
		
	}

}

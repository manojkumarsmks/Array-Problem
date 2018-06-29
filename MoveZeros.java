//https://leetcode.com/problems/move-zeroes/description/ 
import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] inputArray = {1,0};
		
		System.out.println(Arrays.toString(moveZeros(inputArray)));
		
	}
	
	// Time Complexity - O(n)
	// FastPointer and SlowPointer technique 
	private static int[] moveZeros(int[] inputArray) {

		if(inputArray.length == 1)
			return inputArray;
		
		int slowPointer = 0, fastPointer  = 1;
		
		while(fastPointer != inputArray.length){
			
			if(inputArray[slowPointer] == 0 && inputArray[fastPointer] != 0) {
				int temp = inputArray[slowPointer];
				inputArray[slowPointer] = inputArray[fastPointer];
				inputArray[fastPointer] = temp;
				slowPointer++;
				fastPointer++;	
			}
			
			else if(inputArray[slowPointer] == 0 && inputArray[fastPointer] == 0) 
				fastPointer++;
			
			else {
				slowPointer++;
				fastPointer++;
			}
				
			
		}
		
		return inputArray;
		
	}

}

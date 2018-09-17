// https://leetcode.com/problems/sort-array-by-parity/description/
public class SortArrayByParity {

	public static void main(String[] args) {
		int[] input = {0,2,1,4};
		
		input = sortyArrayParity(input);
		
		for (int i : input) {
			System.out.println(i);
		}

	}
	
	public static int[] sortyArrayParity(int[] input) {
		
		int first = 0, last = input.length-1;
		
		while(first <= last) {
			
			if(input[first] % 2 == 0) {
				first++;
			}
			else if(input[last] % 2 != 0) {
				last--;
			}
			
			else {
				input = swap(input, first, last);
				first++;
				last--;
			}
			
		}
		
		return input;
	}

	private static int[] swap(int[] input, int first, int last) {
		
		int temp = input[first];
		input[first] = input[last];
		input[last] = temp;
		
		return input;
	}
	
	

}

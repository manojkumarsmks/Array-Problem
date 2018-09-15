// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeekIndex {

	public static void main(String[] args) {
		int[] array = {0,1,0};
		
		System.out.println(peakIndexMountainArray(array));
	}
	
	public static int peakIndexMountainArray(int[] A) {
		
		int first = 0;
		int second = 1;
		
		while(second != A.length) {
			if(A[first] > A[second])
				return first;
			
			first++;
			second++;
		}
		
		return -1;
	}

}

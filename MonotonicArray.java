// https://leetcode.com/problems/monotonic-array/description/
public class MonotonicArray {

	public static void main(String[] args) {
		int A[] = {1,1,2};
		
		System.out.println(isMonotonic(A));

	}

	public static boolean isMonotonic(int[] A) {
		
		if(A.length < 2)
			return true;
		// flase -  decreasing
		// true - increasing
		// This is smart
		boolean flag = A[0] < A[A.length-1];
		
		int first = 0, second = 1;
		
		/*// Determine if its increasing or decreasing
		while(second != A.length) {	
			if(A[first] > A[second]) {
				flag = false;
				break;
			}
			else if (A[first] < A[second]) {
				flag = true;
				break;
			}
			else {
				first++;
				second++;
			}
		}*/
		
		first = 0;
		second = 1;
		
		while(second != A.length) {
			if(flag) {
				if(A[first] > A[second])
					return false;
			}
			else if(!flag) {
				if(A[first] < A[second])
					return false;
			}
			first++;
			second++;
			
		}
		
		return true;
		
		
	}

}

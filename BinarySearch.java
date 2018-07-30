// Binary Search, Example for Divide and Conquer algorithm.
public class BinarySearch {

	public static void main(String[] args) {
		int[] inputArray = { -1, 0, 3, 5, 9, 12 };
		int n = 5;

		System.out.println(BSIterative(inputArray, n));

	}

	// Itertaive method
	public static int BSIterative(int[] inputArray, int n) {

		if (inputArray == null || inputArray.length == 0)
			return -1;

		int left = 0, right = inputArray.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (inputArray[middle] == n)
				return middle;
			else if (inputArray[middle] > n)
				right = middle - 1;
			else if (inputArray[middle] < n)
				left = middle + 1;
		}

		return -1;
	}

	// Recursion method
	public static int BSRecursion(int[] nums, int target, int left, int right) {

		if (left > right)
			return -1;
		int middle = left + ((right - left) / 2);

		if (nums[middle] == target)
			return middle;

		if (nums[middle] > target)
			return BSRecursion(nums, target, left, middle - 1);
		else
			return BSRecursion(nums, target, middle + 1, right);

	}

}


public class RemoveElements {

	public static void main(String[] args) {

		int[] nums = {2};
		int val = ;
		
		System.out.println(removeElement(nums, val));
	}
	
	public static int removeElement(int[] nums, int val) {
		
		int counter = 0;
		if(nums.length == 1)
			return 1;
		
		int slowPointer = 0, fastPointer  = 1;
		
		while(fastPointer != nums.length){
			
			if(nums[slowPointer] == val && nums[fastPointer] != val) {
				int temp = nums[slowPointer];
				nums[slowPointer] = nums[fastPointer];
				nums[fastPointer] = temp;
				slowPointer++;
				fastPointer++;	
			}
			
			else if(nums[slowPointer] == val && nums[fastPointer] == val) 
				fastPointer++;
			
			else {
				slowPointer++;
				fastPointer++;
			}
				
        
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == val) {
				counter = i;
				break;
			}
		}
		
		return counter;
	}

}

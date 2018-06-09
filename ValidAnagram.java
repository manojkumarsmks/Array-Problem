// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

	public static void main(String[] args) {
		
		String one = "zlap";
		String two = "kcqx";
		
		System.out.println(checkForAnagram(one, two));
	}

	// Array method  - we cannot update the if inputs contain unicode characters
	
	private static boolean checkForAnagram(String one, String two) {
		// create an array of length 26
		int[] alphaCalculator = new  int[26];
		
		// Obviously
		if(one.length() != two.length())
			return false;
		
		// 0th index refers to a
		// 25th index refers to z
		// increment the value in the index 
		for(int i = 0; i<one.length(); i++) {
			alphaCalculator[one.charAt(i)-'a']++;
		}
		
		// Decrement the value in the array for second string
		for(int i = 0; i<two.length(); i++) {
			alphaCalculator[two.charAt(i)-'a']--;
		}
		
		// check if the whole array is zero
		for (int i = 0; i < alphaCalculator.length; i++) {
			if(alphaCalculator[i] != 0)
				return false;
		}
		
		return true;
	}

}

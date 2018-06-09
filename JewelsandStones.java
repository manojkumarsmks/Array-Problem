// https://leetcode.com/problems/jewels-and-stones/description/

public class JewelsandStones {

	public int numJewelsInStones(String J, String S) {
		char[] character = J.toCharArray();
		int totatlJewels = 0;
		
		for (int i = 0; i < character.length; i++) {
			totatlJewels += getIndividualJewelsNumber(S, character[i]);
		}
		
		return totatlJewels;
    }

	private int getIndividualJewelsNumber(String s, char c) {
		int total  = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(c == s.charAt(i))
				total++;
		}
		return total;
	}

}

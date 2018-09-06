// https://leetcode.com/problems/assign-cookies/description/
import java.util.Arrays;

public class AssignCookie {

	public static void main(String[] args) {
		AssignCookie assignCookie = new AssignCookie();
		int[] g = {1,2};
		int[] s = {1,2,3};
		
		
		System.out.println(assignCookie.findContentChildren(g, s));
	}

	// Greedy approach
	public int findContentChildren(int[] g, int[] s) {
		
		int totalContentChildren = 0;
		
		if(s.length == 0 || g.length == 0)
			return 0;
		
        Arrays.sort(g);
        Arrays.sort(s);
		
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < s.length; j++) {
				
				if(s[j] >= g[i]) {
					totalContentChildren++;
					s[j] = 0;
					break;
				}			
			}		
		}
		
		return totalContentChildren;				
	}
}

import java.util.ArrayList;
import java.util.List;

public class PortionOfLargeGroup {

	public static void main(String[] args) {
		String S = "aaa";
		
		List<List<Integer>> result = largeGroupPositions(S);
		
		for (List<Integer> list : result) {
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("-----------------------------------");
		}

	}
	
	public static List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(S.length() <= 2) 
			return result;
		
		int first = 0, second = 1;
		
		char[] sArray = S.toCharArray();
		
		while(second < S.length()) {
			
			int count = 1;
			
			while((second < S.length()) && (sArray[first] == sArray[second])) {
				count++;
				second++;
			}
			if(count >= 3) {
				List<Integer> range = new ArrayList<Integer>();
				range.add(first);
				range.add(second-1);
				result.add(range);	
			}
			
			first = second;
			second++;

		}
		return result;
    }

}

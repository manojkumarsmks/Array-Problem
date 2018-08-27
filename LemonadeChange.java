// https://leetcode.com/problems/lemonade-change/description/
public class LemonadeChange {

	public static void main(String[] args) {
		int bills [] = {5,5,10,10,20};
		LemonadeChange lemonadeChange = new LemonadeChange();
		System.out.println(lemonadeChange.lemonadeChange(bills));
	}

	public boolean lemonadeChange(int[] bills) {
		int fiveDollar = 0, tenDollar = 0, twentyDollar = 0;
		
		for (int i = 0; i < bills.length; i++) {
			if(bills[i] == 5)
				fiveDollar++;
			else if(bills[i] == 10) {
				tenDollar++;
				if(fiveDollar > 0) {
					fiveDollar--;
				}
				else {
					return false;
				}
			}
			else {
				twentyDollar++;
				if(tenDollar > 0) {
					tenDollar--;
					if(fiveDollar > 0)
						fiveDollar--;
					else 
						return false;
				}
				else if(fiveDollar >= 3)
					fiveDollar -= 3;
				else 
					return false;
			}
		}
		return true;
	}

}

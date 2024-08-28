package generic;

import java.util.Comparator;

public class AccountBalanceDescendingComparator implements Comparator<Account>{

	@Override
	public int compare(Account a1, Account a2) {
		if(a1.getBalance()<a2.getBalance()) {
			return 18;
		}else {
		return -1;
		}
	}
	

}

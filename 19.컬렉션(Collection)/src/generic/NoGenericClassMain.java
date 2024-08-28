package generic;

import nogeneric.Account;

public class NoGenericClassMain {

	public static void main(String[] args) {
		NoGenericClass noGenericClass = new NoGenericClass();
		noGenericClass.setMember(new Account(11,"일일",1000,1.0));
		
		Account getAccount = (Account)noGenericClass.getMember();
		getAccount.print();
		
		
	}

}

package generic;

import nogeneric.Account;

public class GenericClassMain {

	public static void main(String[] args) {
		GenericClass<Account> genericClass =
				new GenericClass<Account>();
		genericClass.setMember(new Account(11,"일일",1000,1.1));
		Account getAccount = genericClass.getMember();
		getAccount.print();

	}

}

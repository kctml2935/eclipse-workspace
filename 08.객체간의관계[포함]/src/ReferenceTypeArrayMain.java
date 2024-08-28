
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a;
		int[] ia;
		Account account;
		Account[] accountArray;
		*/
		Account[] accountArray=new Account[5];
		Account account1=new Account(1111, "KIM", 3000, 3.0);
		accountArray[0]=account1;
		accountArray[1]=new Account(2222, "LEE", 5600, 2.8);
		accountArray[2]=new Account(3333, "MIN", 7800, 7.8);
		accountArray[3]=new Account(4444, "NIM", 8900, 8.2);
		accountArray[4]=new Account(5555, "OIM", 9900, 4.6);
		
		Account.headerPrint();
		accountArray[0].print();
		accountArray[1].print();
		accountArray[2].print();
		accountArray[3].print();
		accountArray[4].print();
		System.out.println();
		System.out.println();
		System.out.println("------------for loop-------------");
		Account.headerPrint();
		for(int i=0;i<accountArray.length;i++) {
			Account tempAccount=accountArray[i];
			tempAccount.print();
		}
		System.out.println("------------enhanced for loop-------------");
		Account.headerPrint();
		for(Account tempAccount:accountArray) {
			tempAccount.print();
		}
	}

}

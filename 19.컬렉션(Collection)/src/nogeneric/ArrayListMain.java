package nogeneric;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
	
		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		Account acc2 = new Account(2222, "LEE", 58900, 0.5);
		Account acc3 = new Account(3333, "PARK", 78000, 0.4);
		Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
		Account acc5 = new Account(5555, "SIM", 66000, 0.7);
		Account acc6 = new Account(6666, "HONG", 99000, 1.4);
		Account acc7 = new Account(7777, "KIM", 87600, 0.6);
		Account acc8 = new Account(8888, "KIM", 12300, 2.3);
		Account acc9 = new Account(9999, "MIN", 41200, 4.1);
		
		ArrayList accountList=new ArrayList();
		int size=accountList.size();
		System.out.println("#size:"+size);
		System.out.println("---------------1.add(element)[맨마지막index 에저장]-----------------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------------2.add(index,element)[지정된index 에저장]-----------------");
		accountList.add(1,new Account(1112, "NEW", 3000, 3.3));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------------3.set(index,element)[지정된 index객체저장]----------------");
		accountList.set(accountList.size()-1, new Account(9000, "LAST", 90000, 9.9));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------------4-1.remove(index)[지정된 index객체삭제]----------------");
		Account removeAccount = (Account) accountList.remove(0);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------------4-2.remove(element)[지정된 객체삭제]----------------");
		boolean isRemove = accountList.remove(acc3);
		System.out.println("삭제여부:"+isRemove);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------------5.get(index)[지정된 index객체반환]----------------");
		Account getAccount = (Account)accountList.get(0);
		System.out.println(getAccount);
		
		getAccount = (Account)accountList.get(1);
		System.out.println(getAccount);
		
		getAccount = (Account)accountList.get(2);
		System.out.println(getAccount);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("--------1.계좌전체출력-------------------------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println("--------2.계좌번호 6666번 한개찾기-------------");
		for (Object objectAccount : accountList) {
			Account tempAccount=(Account)objectAccount;
			if(tempAccount.getNo()==6666) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("--------3.계좌주 이름 KIM인계좌 여러개찾기------");
		for (Object objectAccount : accountList) {
			Account tempAccount=(Account)objectAccount;
			if(tempAccount.getOwner().equals("KIM")) {
				tempAccount.print();
			}
		}
		System.out.println("--------4.계좌번호 6666번인계좌1개 삭제------");
		for (Object objectAccount : accountList) {
			Account tempAccount=(Account)objectAccount;
			if(tempAccount.getNo()==6666) {
				System.out.println(">>삭제전 size:"+accountList.size());
				boolean isRemoved=accountList.remove(tempAccount);
				System.out.println(">>삭제성공여부:"+isRemoved);
				System.out.println(">>삭제후 size:"+accountList.size());
				break;
			}
		}
		System.out.println("--------5.계좌주 이름 KIM인계좌 여러개삭제------");
		for(int i=0;i<accountList.size();i++) {
			Account temAccount=(Account)accountList.get(i);
			if(temAccount.getOwner().equals("KIM")) {
				Account removedAccount=(Account)accountList.remove(i);
				removedAccount.print();
				i--;
			}
		}
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		
		
		
	}

}
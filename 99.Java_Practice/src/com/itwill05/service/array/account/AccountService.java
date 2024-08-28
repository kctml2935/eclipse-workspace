package com.itwill05.service.array.account;

/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
public class AccountService {
	/*private int asc_no;
	private String asc_owner;
	private int asc_balance;
	private double asc_iyul;*/
	private Account[] accounts;
	
	public AccountService() {
		accounts = new Account[9];
		accounts[0] = new Account(1111, "KIM", 89000, 1.3);
		accounts[1] = new Account(2222, "AIM", 45000, 2.7);
		accounts[2] = new Account(3333, "FIM", 89000, 4.7);
		accounts[3] = new Account(4444, "XIM", 34000, 6.7);
		accounts[4] = new Account(5555, "hIM", 78000, 3.7);
		accounts[5] = new Account(6666, "KIM", 89000, 5.7);
		accounts[6] = new Account(7777, "KIM", 89000, 4.7);
		accounts[7] = new Account(8888, "qIM", 91000, 1.7);
		accounts[8] = new Account(9999, "mIM", 12000, 0.7);
	}
	/*
	  << 과제 아님 >>
	   0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	/*
	 * << 과제 아님 >>
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		System.out.println(">>은행계좌들 총계좌수:"+this.accounts.length);
		
	}

	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (Account account : accounts) {
			account.print();
		}
		
	}

	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		int totBalance = 0;
		for (Account account : accounts) {
			totBalance+=account.getBalance();
		}
		System.out.println(">>은행 총잔고 : "+totBalance);
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.print();
				break;
			}
		}
	}
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		for (Account account : accounts) {
			if(account.getBalance()>=balance) {
				account.print();
			}
		}
	}
	
	
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/
	public void findByIyulPrint(double iyul) {
		for (Account account : accounts) {
			if(account.getIyul()>=iyul) {
				account.print();
			}
		}
	}
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */
	public void findByOwnerPrint(String Owner) {
		for (Account account : accounts) {
			if(account.getOwner()==Owner) {
				account.print();
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public void ipGum(int no, int money) {
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.setBalance(account.getBalance() + money);
				account.print();
			}
		}
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public void chulGum(int no, int money) {
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.setBalance(account.getBalance() - money);
				account.print();
			}
		}
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		System.out.println("##############정렬전###############");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		//8회
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				int balance1 = accounts[j].getBalance();
				int balance2 = accounts[j+1].getBalance();
				if(balance1 > balance2) {
					//주소값 교환
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		System.out.println("##############w잔고정렬후###############");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {
		System.out.println("##############정렬전###############");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				int balance1 = accounts[j].getBalance();
				int balance2 = accounts[j+1].getBalance();
				if(balance1 < balance2) {
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		System.out.println("##############잔고정렬후###############");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
	}
	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (Account account : accounts) {
			if(account.getNo()==updateAccount.getNo()) {
				account = updateAccount;
				account.print();
				break;
			}
		}
	}
	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	
}

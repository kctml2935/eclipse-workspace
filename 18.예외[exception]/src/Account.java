

public class Account {
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;	//계좌이율
	/**
	 * 기본값으로 초기화된계좌객체생성
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 인자값으로 초기화된객체생성
	 * @param no 		계좌번호
	 * @param owner 	계좌주
	 * @param balance	잔고
	 * @param iyul		이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 계좌데이타 대입
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/*
	 * 입금
	 */
	public void deposit(int money) {
		//balance=balance+money;
		balance+=money;
	}
	/*
	 * 출금
	 */
	/******case1[return]******************
	public boolean withDraw(int money) {
		if(balance-money<0) {
		
			return false;
		}
		balance-=money;
		return true;
	}
	*/
	/******case2[예외]******************/
	public void withDraw(int money) throws InsufficientBalance{
		if(balance-money<0) {
			throw new InsufficientBalance("잔고가 부족합니다.");
		}
		balance-=money;
		return ;
	}
	/*
	 * 계좌헤더출력
	 */
	public void headerPrint() {
		System.out.println("------------------------");
		System.out.printf("%s %4s %4s %3s\n","번호","이름","잔고","이율");
		System.out.println("------------------------");
	}
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %5s %7d %5.2f\n",no,owner,balance,iyul);
	}
	
	/*
	 * << getter,setter메쏘드생성단축키 >>
	 * 
	 * alt+shift + s --> r
	 */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
	
}
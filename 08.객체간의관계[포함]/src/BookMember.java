


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int Membernum;
	private String Membername;
	private String Memberphone;
	private Book Memberbook;
	public BookMember() {
		// TODO Auto-generated constructor stub
	}
	
	public BookMember(int membernum, String membername, String memberphone, Book memberbook) {
		super();
		Membernum = membernum;
		Membername = membername;
		Memberphone = memberphone;
		Memberbook = memberbook;
	}

	public int getMembernum() {
		return Membernum;
	}
	public void setMembernum(int membernum) {
		Membernum = membernum;
	}
	public String getMembername() {
		return Membername;
	}
	public void setMembername(String membername) {
		Membername = membername;
	}
	public String getMemberphone() {
		return Memberphone;
	}
	public void setMemberphone(String memberphone) {
		Memberphone = memberphone;
	}
	
	
	public Book getMemberbook() {
		return Memberbook;
	}

	public void setMemberbook(Book memberbook) {
		Memberbook = memberbook;
	}

	/*
	<<기능>>
	  회원정보출력 
	 */
	public void print() {
		System.out.printf("%d번 회원의 이름은 %s이고 전화번호는 %s이며, 빌린책",Membernum,Membername,Memberphone);
		Memberbook.print();
	}

	
	
	
	
	
}
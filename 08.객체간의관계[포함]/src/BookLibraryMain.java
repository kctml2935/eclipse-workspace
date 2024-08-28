

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember mem1 = new BookMember();
	
		/*
		 * 책객체생성
		 */
		Book book1 = new Book(1, "해리포터", "판타지", "해리포터의 이야기");
	
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		mem1.setMembernum(1111);
		mem1.setMembername("홍길동");
		mem1.setMemberphone("010-1234-1234");
		mem1.setMemberbook(book1);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		mem1.print();
		
	}
}
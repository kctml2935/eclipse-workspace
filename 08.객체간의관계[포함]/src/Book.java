

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int num;
	private String title;
	private String jenre;
	private String Explain;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int num, String title, String jenre, String explain) {
		this.num = num;
		this.title = title;
		this.jenre = jenre;
		this.Explain = explain;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJenre() {
		return jenre;
	}
	public void setJenre(String jenre) {
		this.jenre = jenre;
	}
	public String getExplain() {
		return Explain;
	}
	public void setExplain(String explain) {
		Explain = explain;
	}
	
	public void print() {
		System.out.printf("의 번호는 %d이고 책의 제목은 %s이고 장르는 %s입니다. 책에대한 설명입니다 : %s",num,title,jenre,Explain);
	}
	
	
	
}
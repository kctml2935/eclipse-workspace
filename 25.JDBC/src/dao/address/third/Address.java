package dao.address.third;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
VO(Value Object),DTO(Data Transfer Object)
  	- 회원관리를 위하여 필요한 도메인클래스(VO,DTO)
  	- 회원객체 한명의 데이타를가지고있다.(VO)
  	- 회원객체 한명의 데이타를 저장하기위한멤버변수를 가지고있다
  	- 회원 테이블과 동일한 속성을 멤버필드로가지는 객체
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


public class Address {
	private int no;
	private String name;
	private String phone;
	private String address;
	
	
	
	
	
}

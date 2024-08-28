package com.itwill.shop;

public class ShoppinMallMain {

	public static void main(String[] args) {
		/*
		 * 객체들생성
		 */
		Member member=new Member("홍길동","010-1234-5678","경기도");
		Product product=new Product(3,"혼공자","자습서",20000,3,60000);
		Cart cart=new Cart();
        Order order=new Order();
		/*
		 * 객체들정보출력
		 */
		
		//member.print();
		//product.print();
		cart.setCart(member, product);
		
		cart.showInfoAll();
		

	}

}

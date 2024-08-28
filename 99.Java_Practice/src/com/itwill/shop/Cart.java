package com.itwill.shop;

public class Cart {
	/*
	 * Product.java와 Member.java클래스의 정보를 공유해야함 
	 * 주문 번호, 주문 수량, 주문 날짜 결제 완료 유무,
	 * 상품 번호,상품 이름, 주문 수량
	 * 회원 이름 회원 번호
	 */
	
	/* 
	 * 배송 예정일만 따로 설정함.
	 */
	Member member;
	Product product;
	String arrivalDate = "2023-06-11";
	
	
	void setCart(Member member, Product product) {
		//Member,Product클래스를 cart클래스에서 참조할 수 있게 만드는 메서드.
		this.member = member;
		this.product = product;
	}
	
	void showInfoAll() { //원하는 정보만 출력 가능하게끔.
		System.out.println("----------------"+member.memName+"님의 장바구니----------------");
		System.out.printf("%s %4s %7s %10s %4s %3s %n","상품번호","상품이름","상품정보","상품가격", "주문수량", "총가격");
		System.out.printf("-------------------------------------------------%n");
		System.out.printf("%d %4s %4s %5d %3d %7d %n",product.productNum, product.productName,product.productInfo, product.productPrice,product.amount, product.totalPrice);
		System.out.println();
		
		System.out.println("--------------------배송 정보--------------------");
		System.out.println("주문자 : "+member.memName+"\t \t"+"주문자 전화번호 : "+member.memPhoneNum);
		System.out.println("주소 : "+member.memAddress+"\t"+"배송 예정일 : "+arrivalDate);
		System.out.println();
		
}

}
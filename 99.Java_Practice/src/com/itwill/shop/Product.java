package com.itwill.shop;

public class Product {
	int productNum;
	String productName;
	String productInfo;
	int productPrice;
	int amount;
	int totalPrice;
	/*
	 * 상품번호","상품이름","상품정보","상품가격", "주문수량", "총가격
	*/
	public Product() {
		
	}
	public Product(int productNum, String productName, String productInfo, int productPrice, int amount,
			int totalPrice) {
		this.productNum = productNum;
		this.productName = productName;
		this.productInfo = productInfo;
		this.productPrice = productPrice;
		this.amount = amount;
		this.totalPrice = totalPrice;
	}
	public void print() {
		System.out.printf("상품번호 : %d , 상품이름 : %s , 상품정보 : %s, 상품가격 : %d , 주문수량 : %d, 총가격%d\n",this.productNum
				,this.productName,this.productInfo,this.productPrice,this.amount,this.totalPrice);
	}
}

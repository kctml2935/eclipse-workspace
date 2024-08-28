
public class PackageMain {

	public static void main(String[] args) {
		
		com.itwil.shop.ShopService shopService=
				new com.itwil.shop.ShopService();
		System.out.println(shopService);
		com.itwil.shop.member.Member member=
				new com.itwil.shop.member.Member();
		System.out.println(member);
		com.itwil.shop.member.MemberService memberService=
				new com.itwil.shop.member.MemberService();
		System.out.println(memberService);
		System.out.println("-----com.itwill.shop.product.Product,com.itwill.shop.product.ProductService----");
		com.itwil.shop.product.Product shopProduct=
				new com.itwil.shop.product.Product();
		System.out.println(shopProduct);
		com.itwil.shop.product.ProductService shopProductService=
				new com.itwil.shop.product.ProductService();
		System.out.println(shopProductService);
		System.out.println("-----com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService----");
		com.itwil.shop.admin.Product adminProduct=
				new com.itwil.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwil.shop.admin.ProductService adminProductService=
				new com.itwil.shop.admin.ProductService();
		System.out.println(adminProductService);
	}

}

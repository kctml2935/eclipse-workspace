
import com.itwil.shop.ShopService;
import com.itwil.shop.member.Member;
import com.itwil.shop.member.MemberService;
import com.itwil.shop.product.Product;
import com.itwil.shop.product.ProductService;

public class PackageImportMain {

	public static void main(String[] args) {
		
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		Member member= new Member();
		System.out.println(member);
		MemberService members= new MemberService();
		System.out.println(members);
		System.out.println("-------com.itwil.shop.product.Product,com.itwil.shop.product.ProductService--------");
		Product shopProduct = new Product();
		System.out.println(shopProduct);
		ProductService shopProductService = new ProductService();
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

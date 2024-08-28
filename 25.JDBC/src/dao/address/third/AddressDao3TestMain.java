package dao.address.third;

import java.util.List;

public class AddressDao3TestMain {

	public static void main(String[] args)throws Exception {
		 AddressDao3 addressDao3=new AddressDao3();
		 System.out.println("1.insert");
		 addressDao3.insert(new Address(0, "김소미", "888-0000", "대전시 유성구"));
		 
		 System.out.println("2.updateByNo");
		 addressDao3.updateByNo(new Address(10,"체인지","000-1111","LA"));
		 addressDao3.updateByNo(new Address(11,"체민지","888-9999","CA"));
		 System.out.println("3.deleteByNo");
		 addressDao3.deleteByNo(4);
		 addressDao3.deleteByNo(5);
		 addressDao3.deleteByNo(6);
		 System.out.println("4.selectByNo");
		 Address findAddress1 = addressDao3.selectByNo(11);
		 System.out.println(findAddress1);
		 Address findAddress2 = addressDao3.selectByNo(30);
		 System.out.println(findAddress2);
		 Address findAddress3 = addressDao3.selectByNo(999);
		 System.out.println(findAddress3);
		 System.out.println("5.selectAll");
		 List<Address> addressList = addressDao3.selectAll();
		 System.out.println(addressList);
	}

}
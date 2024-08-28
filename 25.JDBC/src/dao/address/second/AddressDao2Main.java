package dao.address.second;

public class AddressDao2Main extends AddressDao2{

	public static void main(String[] args) throws Exception{
		AddressDao2 addressDao = new AddressDao2();
		System.out.println("1.insert");
		//addressDao.insert("이소라","122-8989","대전 성심당");
		//addressDao.insert("삼소라","333-4444","대구 뭉탱이");
		//addressDao.insert("뿔소라","899-8989","서울");
		System.out.println("2.update");
		 addressDao.updateByNo(10,"체인지","000-1111","LA");
		 addressDao.updateByNo(11,"체민지","888-9999","CA");
		 System.out.println("3.deleteByNo");
		 addressDao.deleteByNo(4);
		 addressDao.deleteByNo(5);
		 addressDao.deleteByNo(6);
		 System.out.println("4.selectByNo");
		 addressDao.selectByNo(10);
		 addressDao.selectByNo(20);
		 addressDao.selectByNo(999);
		 addressDao.selectAll();

	}

}

package dao.address.first;

public class AddressDao1Main extends AddressDao1{

	public static void main(String[] args) throws Exception{
		AddressDao1 n = new AddressDao1();
		n.insert();
		n.deleteByNo();
		n.updateByNo();
		n.selectByNo();
		n.selectAll();

	}

}

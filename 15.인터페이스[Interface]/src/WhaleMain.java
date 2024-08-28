
public class WhaleMain {

	public static void main(String[] args) {
		System.out.println("----------Whale--------");
		Whale whale1 = new Whale();
		whale1.breath();
		whale1.breastFeed();
		
		System.out.println("--------Animal--------");
		Animal whale2 = new Whale();
		whale2.breath();

		System.out.println("--------Mammal--------");
		Mammal whale3 = new Whale();
		whale3.breastFeed();
		
		
	}

}

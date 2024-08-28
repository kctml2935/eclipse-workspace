/*
 * 
 */
public class WhileGuGuDan {

	public static void main(String[] args) {
		int i = 2;
		
		while(i < 10) {
			int j = 1;
			
			while(j<10) {
				System.out.printf("%d*%d = %d \t",i,j,i*j);
				j++;
			}
			System.out.println("");
			i++;
		}
		System.out.println("");
		i=1;
		while(i < 10) {
			int j = 2;
			
			while(j<10) {
				System.out.printf("%d*%d = %d \t",j,i,i*j);
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}

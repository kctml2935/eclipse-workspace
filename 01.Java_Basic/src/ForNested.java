
public class ForNested {

	public static void main(String[] args) {
		System.out.println("1.---------------------------------------");
		/*
	 	★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
		★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
		★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
		★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
		★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
	    */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%s[%d,%d]","★",i,j);
			}
			System.out.println();
		}
		System.out.println("2.---------------------------------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					System.out.print("☆");
				}else {
				System.out.print("★");
				}
			}
			System.out.println();
		}
		System.out.println("3.---------------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j) {
					System.out.print("★");
				}else if(i < j){
					continue;
				}
				
			}
			System.out.println();
		}
		System.out.println("4.---------------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for(int i=5;i>0;i--) {
			for(int j=0;j<=5;j++) {
				if(i > j) {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		System.out.println("5.---------------------------------------");
		/*
		★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i<=j) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}

	}

}

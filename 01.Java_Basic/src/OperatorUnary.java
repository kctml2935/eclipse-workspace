/*
		 단항연산자
		     - 증가,감소연산자
			   ex> i++ , i-- , ++i , --i 
                     - 자기자신의값을 정수 1만큼 증가시키거나 감소시키는
			  연산자
*/
public class OperatorUnary {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn =! myTurn;
		System.out.println(myTurn);
		myTurn =! myTurn;
		System.out.println(myTurn);
		
		int kor=90;
		
		boolean isValidScore = (kor >=0) && (kor <=100);
		boolean isInValidScore = !((kor >=0) && (kor <=100)); //(kor <0) || (kor>100) 과 같은의미
		System.out.println("국어점수가 유효한지여부 "+isValidScore);
		System.out.println("국어점수가 유효안한지여부 "+isInValidScore);
		
		System.out.println("------------[++i,--j]-----------");
		int i = 5;
		int j = 5;
		++i;
		--j;
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("------------[i++,j--]-----------");
		i=5;
		j=5;
		
		i++;
		j--;
		
		System.out.println(i);
		System.out.println(j);
		
		i=5;
		j=5;
		
		int ir = ++i;
		int jr = j++;
		
		System.out.println("ir-->"+ir);
		System.out.println("jr-->"+jr);
		System.out.println("i-->"+i);
		System.out.println("j-->"+j);
		
		System.out.println("---------------------------");
		i=5;
		j=5;
		
		System.out.println(++i);
		System.out.println(j++);
		System.out.println("i-->"+i);
		System.out.println("j-->"+j);
		
		
		
		
	}

}

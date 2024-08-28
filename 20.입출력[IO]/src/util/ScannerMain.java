package util;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("********성적관리프로그램********");
		while(true) {
			System.out.print("이름을 입력하세요.");
			String nameStr = scanner.next();
			System.out.println("국어점수 입력하세요");
			int kor = scanner.nextInt();
			System.out.println("영어점수 입력하세요");
			int eng = scanner.nextInt();
			System.out.println("수학점수 입력하세요");
			int math = scanner.nextInt();
			
			int tot = kor + eng + math;
			double avg = tot/3.0;
			System.out.println(nameStr + "\t" + kor+ "\t" +eng+ "\t" +math+ "\t" +tot+ "\t" +avg);
			System.out.println("계속할까요?(y(Y)/n(N))");
			String yn = scanner.next();
			if(yn.equalsIgnoreCase("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
	}

}

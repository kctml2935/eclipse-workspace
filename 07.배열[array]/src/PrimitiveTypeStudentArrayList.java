
public class PrimitiveTypeStudentArrayList {

	public static void main(String[] args) {
		System.out.println("-----------학생10명의 성적 데이타를 저장하기 위한 배열객체 생성 후 초기화----------");
		/*
		noArray=new int[10];
		for(int i=0;i<noArray.length;i++) {
			noArray[i]=i+1;
		}
		*/
		int[] noArray = {1,2,3,4,5,6,7,8,9,10};
		
		String[] nameArray = {"KIM","LEE","PARK","CHOI","SIM","KIM","PIM","MIN","AIM","LIM"};
		int[] korArray= {89,56,89,91,90,82,45,78,90,99};
		int[] engArray= {45,76,29,91,83,32,95,88,87,10};
		int[] mathArray= {77,80,97,69,68,70,39,48,99,74};
		int[] totArray= {0,0,0,0,0,0,0,0,0,0};
		double[] avgArray= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeArray= {'F','F','F','F','F','F','F','F','F','F'};
		int[] rankArray= {1,1,1,1,1,1,1,1,1,1};
		
		/*
		 * 총점,평균,평점계산
		 */
		for(int i =0;i<noArray.length;i++) {
			totArray[i]=korArray[i]+engArray[i]+mathArray[i];
			avgArray[i]=totArray[i]/3.0;
			if(avgArray[i]>=90) {
				gradeArray[i]='A';
			}else if(avgArray[i]>=80) {
				gradeArray[i]='B';
			}else if(avgArray[i]>=70) {
				gradeArray[i]='C';
			}else if(avgArray[i]>=60) {
				gradeArray[i]='D';
			}else{
				gradeArray[i]='F';
			}
		}
		/*
		 *  총점으로 석차부여
		 */
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(totArray[i] < totArray[j]) {
					rankArray[i]++;
				}
				
			}
		}
		
		/*
		 * 학생검색(번호,국어,영어,수학,학점,석차)
		 */
		System.out.println(">>번호 3번인학생 1명찾아서 1명 정보출력(학생번호는 중복없음)");
		for(int i =0;i<noArray.length;i++) {
			if(noArray[i]==3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		
		System.out.println(">>국어점수 80점 이상인 학생들 여러명 찾아서 여러명 정보출력");
		for(int i =0;i<noArray.length;i++) {
			if(korArray[i]>=80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);

			}
		}
		System.out.println(">>영어점수 80점 이상인 학생들 여러명 찾아서 여러명 정보출력");
		for(int i =0;i<noArray.length;i++) {
			if(engArray[i]>=80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		System.out.println(">>수학점수 80점 이상인 학생들 여러명 찾아서 여러명 정보출력");
		for(int i =0;i<noArray.length;i++) {
			if(mathArray[i]>=80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		System.out.println(">>학점 C 인 학생들 여러명 찾아서 여러명 정보출력");
		for(int i =0;i<noArray.length;i++) {
			if(gradeArray[i]=='C') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		/*
		 * 이름이 KIM인 학생 모두 찾아서 출력
		 */
		System.out.println(">>이름이 KIM인 학생들 여러명 찾아서 여러명 정보출력");
		for(int i =0;i<noArray.length;i++) {
			if(nameArray[i].equals("KIM")) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				
			}
		}
		/*
		 * 정렬
		 *   1.오름차순(ascending)
		 *     ex> 1,2,3,4,5...
		 *         a,b,c,d..
		 *         가,나,다..힣
		 *   2.내림차순(descending)
		 *     ex> 5,4,3,2,1
		 *         z,y,x....
		 *         힣..다,나,가
		 */
		
		/*
		 * 변수내용교환(swap)
		 */
		int a = 1;
		int b = 2;
		System.out.println("교체전> a="+a+", b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("교체후> a="+a+", b="+b);
		System.out.printf("-------------------학생성적출력 정렬전---------------\n");
		System.out.printf("%s %2s %2s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------\n");

		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}	
		/*
		 * 총점으로 오른차순
		 * 9회정렬
		 */
		for(int i=0;i<10;i++) {
		for(int j=0;j<noArray.length-1;j++) {
			if(totArray[j]<totArray[j+1]) {
				//swap tot
				int tempTot=totArray[j];
				totArray[j]=totArray[j+1];
				totArray[j+1]=tempTot;
				//swap no
				int tempNo=noArray[j];
				noArray[j]=noArray[j+1];
				noArray[j+1]=tempNo;
				//swap name
				String tempName = nameArray[j];
				nameArray[j]=nameArray[j+1];
				nameArray[j+1]=tempName;
				//swap kor
				int tempKor=korArray[j];
				korArray[j]=korArray[j+1];
				korArray[j+1]=tempKor;
				//swap eng
				int tempEng=engArray[j];
				engArray[j]=engArray[j+1];
				engArray[j+1]=tempEng;
				//swap math
				int tempMath=mathArray[j];
				mathArray[j]=mathArray[j+1];
				mathArray[j+1]=tempMath;
				//swap avg
				double tempAvg=avgArray[j];
				avgArray[j]=avgArray[j+1];
				avgArray[j+1]=tempAvg;
				//swap grade
				char tempGrade=gradeArray[j];
				gradeArray[j]=gradeArray[j+1];
				gradeArray[j+1]=tempGrade;
				//swap rank
				int tempRank=rankArray[j];
				rankArray[j]=rankArray[j+1];
				rankArray[j+1]=tempRank;
			}
		}
		}
		
		System.out.printf("-------------------학생성적출력 정렬후---------------\n");
		System.out.printf("%s %2s %2s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------\n");

		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}		
	}

}
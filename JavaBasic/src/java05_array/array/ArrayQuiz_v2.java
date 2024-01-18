package java05_array.array;

import java.util.Scanner;

public class ArrayQuiz_v2 {
//	5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
//	그 후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
//
//	- 필요한 배열
//	 1. 각 층의 사는 인원을 담는 배열 arr[6]
//	   // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//	   
//	 2. 각 층의 관리비 배열 arr2[6]
//	   // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//	----------------------- 입력 (입력시 for문을 이용한다.)
//	1층의 사는 인원은 ? 4
//	2층의 사는 인원은 ? 5
//	3층의 사는 인원은 ? 11
//	4층의 사는 인원은 ? 2
//	5층의 사는 인원은 ? 8
//	----------------------- 출력 (출력시 for 문을 이용한다.)
//	1층의 총 관리비 : 48000원
//	2층의 총 관리비 : 60000원
//	3층의 총 관리비 : 132000원
//	4층의 총 관리비 : 24000원
//	5층의 총 관리비 : 96000원
//
//	건물에 사는 총 인원은 30명입니다.
//	관리비의 총 금액은 360000원 입니다.	

	public static void main(String[] args) {
		
		final int FLOOR = 5;
		final int FEE = 12000;
		
		//--- 필요한 변수 선언 ---
		Scanner sc = new Scanner(System.in);
		
		//각 층 인원 + 총 인원 배열
//		int[] people = new int[6]; //arr
		int[] people = new int[FLOOR+1];
		
		//각 층 관리비 + 총 관리비 배열
//		int[] cost = new int[6]; //arr2
		int[] cost = new int[FLOOR+1];
		
		
		//--- 각 층의 인원 입력 ---
		
		//테스트 데이터, ***나중에 Scanner입력으로 변경 필수
//		people[0] = 1;
//		people[1] = 2;
//		people[2] = 3;
//		people[3] = 4;
//		people[4] = 5;
		
		//1~5층 인원 입력
		for(int i=0; i<FLOOR; i++) {
			System.out.print( (i+1) + "층의 인원은? ");
			people[i] = sc.nextInt();
			
			//총 인원 계산
			people[FLOOR] += people[i];
		}
		
		//총 인원 계산
//		people[5] = people[0] + people[1] + people[2] + people[3] + people[4];
		
		//TEST] 인원 출력
//		System.out.println("**테스트 : 인원 수**");
//		for(int i=0; i<people.length; i++) {
//			System.out.println(people[i]);
//		}
//		System.out.println("*****");
		
				
		//--- 관리비 계산 ---
		for(int i=0; i<cost.length; i++) {
			cost[i] = people[i] * FEE;
		}
		
		
		//--- 전체 출력 ---
		System.out.println();
		System.out.println("- - - 각 층의 관리비 - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.println( (i+1) + "층의 총 관리비 : " + cost[i] + "원");
		}	
		
		System.out.println();
		System.out.println("건물에 사는 총 인원은 " + people[5] + "명 입니다.");
		System.out.println("관리비의 총 금액은 " + cost[5] + "원 입니다.");	
		
	}
}
















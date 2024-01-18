package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {
	public static void main(String[] args) {
		
		// Quiz
		
		// 숫자를 여러 개 입력 받아 모든 값들의 총합을 구하고
		// 최종 합계를 출력하는 프로그램
		
		// -> 숫자 0을 입력하면 종료
		
		// -> do-while구문 활용
		
		//-------------------------------------------------------
		
		// 입력 
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합 변수
		int num = 0; // 입력 받은 숫자 저장 변수
		
		do {
			System.out.print("Input Number(exit : 0) : "); // 입력받기
			num = sc.nextInt();
			
			sum += num; //합 구하기
			
		}while(num != 0); // 0이 아닐 때, 반복 수행
		
		System.out.println("총 합은 : " + sum); // 합계 출력
		
		/*
		 * loop {
		 * System.out.print("Input Number(exit : 0) : ");
		 * num = sc.nextInt();
		 * 
		 * sum += num;
		 * }
		 * 
		 * System.out.println();
		 * System.out.println("총 합은 : " + sum);
		 */
	}
}

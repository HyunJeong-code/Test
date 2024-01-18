package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {
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
		int num; // 입력 받은 숫자 저장 변수
		
		while( true ) {
			System.out.println("Input Number(exit : 0) : ");
			num = sc.nextInt();
			
			// 0 입력하면 반복문 종료
			if(num == 0) {
				// 반복문 종료
				break;
			}
			
			sum += num;
		}
		
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

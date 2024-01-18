package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		// Quiz. 2~9단 구구단 출력
		
		// 필요 변수
		// 단 변수 : i (2 ~ 9)
		// 곱하는 수 : j (1 ~ 9)
		
		// 단 변수 하나의 값 당, 9번(1 ~ 9) 곱해야 함
		
		// 1. 바깥족 for문
		//		2 ~ 9 단 반복
		
		//		dan, 2 ~ 9, x8
		
		// 2. 안쪽 for문
		//		각 단수에 맞는 구구단 출력
		
		//		i, 1 ~ 9, x9
		
		// 단 진행 반복
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			
			// 구구단 출력
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			
			// 각 단의 구구단 출력 후, 구분
			System.out.println("--------------------");
		}
		
		// 책 p.107 ~ p.114 -> 1~10 합 구하기
		// 책 p.117 -> 2단 ~ 9단 구하기
		
	} // main end
} // class end

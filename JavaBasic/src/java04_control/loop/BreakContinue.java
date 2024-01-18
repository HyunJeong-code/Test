package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {
		
		// break;
		
		// 반복문(for, while, do-while) 또는 switch문을 중단시키는 코드
		
		//에러
		// -> 반복문이나 switch없이 break;를 사용 불가
//		if( true ) {
//			break; 
//		}
		
		for(int i = 0; i < 100; i++) { //i, 0 ~ 99, x100
			
			System.out.println(i);
			
			if(i >= 5) { // i==5보다는 더 안전하게 종료 -> 코드가 길어질 경우
				break;
			}
			
		}
		
		System.out.println("-----------------");
		
		// for도 자동완성이 있지만, 거의 직접 사용함
		
		// 중첩된 제어문에서 break를 사용하면 가까운 블록의 제어문 한 개만 중단
		// -> 안쪽 제어문에서 바깥쪽 for문 중단 불가
		for(int i = 0; i < 5; i++) { //i, 0 ~ 4, x5
			for(int j = 0; j < 5; j++) { //j, 0 ~ 4, x5
				
				if( j == 2) break;
//				if( j >= 2) break;
				
				System.out.println("i : " + i + ", j : " + j);
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		//--------------------------------------
		
		
		// continue;
		
		// 반복문에서만 사용할 수 있는 제어문
		
		// 현재 반복코드를 중단하고 다음 반복을 수행
		// 반복문의 {}중괄호 블록의 남은 부분을 1번 건너뜀
		
		for(int i = 0; i < 10; i++) { //i, 0 ~ 9, x10
			if(i % 2 == 0) { // 짝수
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		// -> (예상하지 못한) 무한 루프
//		int i = 0;
//		while(i < 10) { //i, 0 ~ 9, x10
//			if(i % 2 == 0) { // 짝수
//				continue;
//			}
//			i++;
//			System.out.println(i);
//		}
		
		// for문에서 continue는 증감문으로 이동
		// while, do-while에서는 continue는 조건문으로 이동
	}
}

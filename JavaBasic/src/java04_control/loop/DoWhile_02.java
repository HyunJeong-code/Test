package java04_control.loop;

public class DoWhile_02 {
	public static void main(String[] args) {
		
		//Dowhile 사용 예시
		// -> 메뉴 화면, 선택
		
//		while( 4번을 선택하지 않으면 ) {
//			// ------ 메뉴 ------
//			// 1. 사용자 정보 입력
//			// 2. 사용자 검색
//			// 3. 전체 사용자 출력
//			// 4. 종료
//
//			// 메뉴 선택 >> ___
//		}
//
//		do {
//			// ------ 메뉴 ------
//			// 1. 사용자 정보 입력
//			// 2. 사용자 검색
//			// 3. 전체 사용자 출력
//			// 4. 종료
//
//			// 메뉴 선택 >> ___
//		}while( 4번을 선택하지 않으면 );
		
		//--------------------------------------
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
			//System.out.println("-" + i);
		}
		
		System.out.println("-------------------");
		
		i = 0;
		do {
			System.out.println(i);
			i++;
			//System.out.println("-" + i);
		} while(i < 5);
		
		
	}
}

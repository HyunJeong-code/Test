package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
		
		//do-while loop
		
//		do {
//			// 반복 수행 코드 영역
//		} while( 조건식 ); // 세미콜론 필수
//
//		// 처음 do키워드 만나면 조건 검사 없이 {}중괄호 코드를 실행
		
		// 이후에 조건식 검사를 하고 true면 do부터 반복, false면 중단
		
		// -> 최초 1회를 무조건 실행하고 다음부터 조건에 따라 반복 결정
		
		//-----------------------------------------------
		
		// 무한 루프
		
//		do {
//			System.out.println("hello");
//		} while(true);
//		
		do {
			System.out.println("Hi");
		} while(false);
		
		
	}
}

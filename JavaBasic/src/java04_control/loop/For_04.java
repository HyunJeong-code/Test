package java04_control.loop;

public class For_04 {
	public static void main(String[] args) {
		
		// "Hello" 7번 출력하시오
		
		// 반복횟수 : 7번
		// 반복구간 : 0 ~ 6
		
		//반복 수행할 코드
		// -> "Hello" 출력
		
		//------------------------------------
		
		// 초기식 : int i = 0; (i변수 선언, 반복 구간의 시작값으로 대입, 주로 0)
		// 조건식 : i < 7; (i변수 검사, 반복횟수보다 작은(<, lt) 조건으로 설정)
		// 증감식 : i++; (1씩 증가)
		
		for(int i = 0; i < 7; i++) {
			System.out.println("Hello");			
		}
		
//		System.out.println("Hello");
		
		
	}
}

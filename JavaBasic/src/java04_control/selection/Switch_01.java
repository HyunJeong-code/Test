package java04_control.selection;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch문, 선택문, 조건문
		// switch-case문
		
//		switch( 비교 대상 ) { // 비교 대상 : 변수, 연산 결과
//		
//			case 비교값1 : 
//		
//			case 비교값2 : 
//
//			case 비교값3 : 
//
//			default : 
//		}

		// 비교 대상과 같은 값으로 지정한 case구문의 위치부터
		// 아래쪽 코드를 전부 실행

		// case의 값들 중 같은 값이 없으면 default부터 실행

		// defalut부분은 생략 가능
		
		int num = 20;
		
		switch(num) {
		case 10 : 
			System.out.println("10 입니다.");
			break;
		case 20 : 
			System.out.println("20 입니다.");
			break;
		case 30 : 
			System.out.println("30 입니다.");
			break;
		default : 
			System.out.println("10, 20, 30 모두 아닙니다.");
			break; // 마지막에 실행되기 때문에 생략 가능
		}
	}
}

package java02_operator;

public class Unary_01 {
	public static void main(String[] args) {
		
		// 단항 연산자 - 부호, sign
		// + -
		
		int num1 = -7; //음수
		int num2 = +7; //양수
		
		//-------------------------
		
		System.out.println(num1);
		
		//-------------------------

		System.out.println(-num1);
		System.out.println(-(-7)); //변수값 불러오기
		System.out.println(7); //부호 변환
		
		//-------------------------
		
		//	!		논리 부정 연산자
		//	(type)	형변환 연산자
		
		//	.		참조연산자
		
		// 비트단위 논리연산자
		//	~	비트 NOT(단항 연산자)
		//	^	비트 XOR(이항 연산자)
		//	&	비트 AND(이항 연산자)
		//	|	비트 OR(이항 연산자)
		
		// 비트단위 시프트(shift) 연산자
		
		//	<<	left shift
		//	>>	right shift
		//	>>>	right shift
		
	}
}

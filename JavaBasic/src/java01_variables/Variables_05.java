package java01_variables;

public class Variables_05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//학생의 나이
//		int student age; //에러, 띄어쓰기 금지
		
		int student_age; //snake case, 뱀 표기법
		
		int stduentAge; //camel case, 낙타 등 표기법
		
		//자바에서는 낙타등표기법(Camel Case)를 권장
		
		//변수의 이름은 소문자로 시작
		
		//------------------------------------------------
		
		//에러, 숫자로 시작 금지
//		int 1stNumber;
		
		int firstNumber;
		
		//------------------------------------------------
		
		//에러, 예약어(키워드)는 사용 불가
//		int int;
//		int static; 
		
		//------------------------------------------------
		
		//** 의미없는 변수명을 사용하지 않도록 한다!
		
		int a;
		int b;
		int c;
		
		//------------------------------------------------
		
		//알아보기 힘든 식별자 사용 금지
		
		//에러, java11부터...
//		int _;
		
		int $;
		int _____;
		int __$$_$_$$_$;
		
		__$$_$_$$_$ = 333;
		
		System.out.println(__$$_$_$$_$);
		
		//------------------------------------------------

		int number;
		
		//자바에서는 비추천
		int number_;
		int _number;
		
		//그나마 자바 추천
		int $number;
		
		//추천
		int number1;
		int number2;
		int number3;
		
		int maxNumber;
			
		//------------------------------------------------
		
		//한글로 식별자를 설정하면 안된다!
		double 넓이 = 5435.234;
		
		System.out.println(넓이);
		
	}
}
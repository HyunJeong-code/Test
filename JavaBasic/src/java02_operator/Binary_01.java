package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {
		
		//이항 연산자 - 산술
		// + - * / %
		//----------------------------------
		
		int num1 = 16, num2 = 7; //피연산자
		
		int result; //연산의 결과값을 저장할 변수
		
		result = num1 + num2; // 연산한 값을 반환해서 대입
		//result = 16 + 7; // 각 변수의 값을 불러옴
		//result = 23; // 덧셈 연산 수행
		// -> result변수에 결과값 23이 저장
		
		System.out.println("덧셈 결과 : " + result);
		
		System.out.println("---------------");
		
		//----------------------------------
		
		// %
		// 나머지 연산자
		// modular operator
		// mod 연산자
		// 모드 연산자
		
		// 나눗셈을 수행하고 그 나머지를 결과값으로 나타낸다.
		
		num1 = 15;
		num2 = 6;
		
		result = num1 % num2;
		
		System.out.println(num1 + " 값을 " + num2 + " (으)로 나눈 나머지 : " + result);
		
		System.out.println("---------------");
		
		//잘못작성한 코드 - 연산자 우선순위, 연산방향을 고려 X
		System.out.println("num1 + num2 = " + num1+num2);
		System.out.println("num1 + num2 = " + 15 + 6);
		System.out.println("num1 + num2 = 15" + 6);
		System.out.println("num1 + num2 = 156");
		
		System.out.println("---------------");
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2)); // 2.5가 아니다
		System.out.println("num1 % num2 = " + (num1%num2));
		
		System.out.println("---------------");
		
		// 산술 연산은 반드시 피연산자들의 데이터타입이 같아야 함
		
		// 산술 연산의 결과값도 피연산자와 같은 데이터타입을 가짐
		System.out.println("15 / 6 = " + (15/6)); // int / int -> int
		System.out.println("15.0 / 6.0 = " + (15.0/6.0)); // double / double -> double
		
		System.out.println("---------------");
		
		System.out.println((double) num1 / (double) num2);
		System.out.println((double) 16 / (double) 6); 
		System.out.println(15.0 / (double) 6); //왼쪽항 double로 형변환
		System.out.println(15.0 / 6.0 ); //왼쪽항 double로 형변환
		System.out.println(2.5); // double 데이터들 나눗셈
		
		System.out.println("---------------");
		
		System.out.println(15 / (double) 6); // int / double
		System.out.println(15 / 6.0); // int / double
		System.out.println(15.0 / 6.0 ); // double / double(자동형변환)
		System.out.println(2.5);
		
		System.out.println("----잘못 사용한 경우----");
		
		num1 = 17;
		num2 = 3;
		
		System.out.println( (double) (num1 / num2));
		System.out.println( (double) (17 / 3));
		System.out.println( (double) 5);
		System.out.println(5.0);
		
		System.out.println("---------------");
		
		double dNum = 3.14;
		
		System.out.println("3.14 / 2 = " + (dNum/2));
		System.out.println("3.14 % 2 = " + (dNum%2));
		//실수의 나머지 계산은 되지만 비추천(할 일이 없다..)
		//** 실수 계산에서는 부동소수점 오차가 발생 가능
		// -> 1.1400000000000001
		
	}
}

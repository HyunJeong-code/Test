package java02_operator;

public class Binary_02 {
	public static void main(String[] args) {
		
		// 이항연산자 - 대입(assign)
		// =
		
		// 오른쪽에 잇는 값을 왼쪽에 있는 공간에 저장
		// 연산방향이 오른쪽 -> 왼쪽
		
		// 오른쪽 항은 값으로 사용할 수 있는 상수, 변수, 연산결과 등
		// 왼쪽 항은 공간으로 사용할 수 있는 변수
		
		// 연산자 우선순위가 최하위
		//----------------------------------------------------------
		
		int num1 = 10;
		int num2;
		
		num2 = 11;
		num1 = 22;
		
		//----------------------------------------------------------
		
		//num1변수에 저장된 값 22를 불러와서 num3변수 공간에 대입(저장)
		int num3 = num1;
		
		//----------------------------------------------------------
		
		// 대입연산자는 대입한 값을 연산식에 리턴
		int num4, num5, num6;
		
//		num6 = num5;(X)
//		num6 = num5 = num4;(X)
//		num6 = num5 = num4 = 33;
//		num6 = num5 = 33;
//		num6 = 33;
//		33; //버려짐
		
		// 복합 대입 연산자
		// 다른 연산자와 대입연산자를 함께 사용하는 연산자
		
		// 산술 대입 연산자
		// += -= *= /= %=
		
		num1 = 13;
		num2 = 14;
		
		System.out.println("--- 산술 대입 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 왼쪽 항의 값을 오른쪽 항의 값과 덧셈한 후, 왼쪽 항에 대입
		num2 += num1;
//		num2 = num2 + num1;
		
		System.out.println("--- 산술 대입 후 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 -= num1;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 *= num1;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 /= num1;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 %= num1;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		//----------------------------------------------------------
		
		// 복합대입연산자의 대입기호(=)는 항상 오른쪽
		num2 -= 8; // -= 산술 복합대입연산자 (이항 연산자)
		num2 =- 8; // - 부호 변환 연산자 (단항 연산자)
				   // = 대입 연산자 (이항 연산자)

	}
}

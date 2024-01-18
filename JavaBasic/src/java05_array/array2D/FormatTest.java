package java05_array.array2D;

public class FormatTest {
	public static void main(String[] args) {
		
		//실수 데이터의 소수점 출력 서식 지정
		
		double data = 123.456789;
		
		System.out.println("그냥 출력 : " + data);
		
//		String.format("서식 문자열", 데이터);
		// 서식 문자열에 맞게 데이터를 서식화하고 String타입으로 반환
		
		String str = String.format("%d100점 입니다.", 100);
		System.out.println(str);
		
		str = String.format("%f 입니다.", data);
		System.out.println(str);
		
		//**서식 문자의 종류
		//	%d - 10진수 정수
		//	%f - 실수
		//	%s - 문자열
		//	%c - 단일 문자
		
		//** %기호와 형식지정자 사이에 숫자를 이용하여 자릿수를 지정 가능
		
		//-----------------------------------------------------------
		
		System.out.println("------------------------------");
		
		System.out.println(String.format("%10d 값 출력", 123));
		System.out.println(String.format("%10d 값 출력", 123456));
		System.out.println(String.format("%10d 값 출력", 123456789));
		
		System.out.println(String.format("%5d%10s%7f",  456, "Hello", 3.14));
		
		//** 실수 데이터는 정수부분, 소수부분, .기호 자리를 지정 가능
		
		// ex) %9.3f
		//		전체 9자리를 구성
		//		소수부분은 3자리로 고정
		//		.점 기호도 1자리 차지
		//		나머지를 정수부분이 사용
		
		System.out.println(String.format("%10.4f",  123.45));
		System.out.println(String.format("%10.4f",  123.456789));
		
		System.out.println(String.format("%.2f",  123.456789));
		
		System.out.println("-------------------------------");
		
		System.out.printf("%d%s", 1122, "hello");
		
		//** printf == print(String.format())
		
		
	}
}

package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//----------------------------------
		
		//Scanner를 이용한 char 값 처리
		
		// -> Scanner클래스에는 char를 직접 입력 처리하는 기능이 없음
		// -> String타입은 char형 데이터를 나열해 놓은 구조
		// -> String으로 입력받은 문자열의 첫 글자를 char형으로 사용
		
		//----------------------------------
		
//		String str = new String("Apple Banana");
		String str = "Apple Banana";
		
		char returnData = str.charAt(8);
		
		System.out.println("8번째 인덱스 : " + returnData);
		
		returnData = str.charAt(0);
		System.out.println("첫 글자 : " + returnData);
		
		//----------------------------------
		
		// 둘 중 원하는 거(편한 거) 골라 쓰기
		System.out.println("-------------------------------");
		
		System.out.print("Input : ");
		String data = sc.nextLine();
		
		System.out.println(data.charAt(0));
		
		System.out.println("-------------------------------");
		System.out.print("Input : ");
		char charData = sc.nextLine().charAt(0);
		System.out.println(charData);
		
		
	}
}

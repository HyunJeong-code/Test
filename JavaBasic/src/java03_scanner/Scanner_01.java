package java03_scanner;

import java.util.Scanner;

import java01_variables.Variables_02;

//** import 선언 코드
// -> 현재 소스코드에서 java.util.Scanner 클래스의 이름을
//	  패키지를 생략한 Scanner로 사용하겠다는 선언

public class Scanner_01 {
	public static void main(String[] args) {
		
		// class Scanner
		// 스캐너 클래스
		
		// 키보드로 입력한 내용을 프로그램 데이터로 가져오는 기능 클래스
		
		// 입력 기능 클래스
		//--------------------------------------------------------------
		
		//기본형 변수
		int num;	//int형 변수 선언
		num = 123;	//int값 대입
		
		//--------------------------------------------------------------
		
		//참조형 변수
		java.util.Scanner input; // 상단에 import문 작성하면, 'java.util'은 생략 가능
		
		Scanner in;
		
		//**Organize Imports (import 정리) : ctrl + shift + o
		
		//--------------------------------------------------------------
		
		Scanner sc; //클래스 이름을 축약해서 클래스 이름으로 사용하는 경우가 많음
		
		// 객체 생성
		sc = new Scanner(System.in);
		
		// new Scanner() : 입력 기능 생성(활성화)
		// System.in : 키보드
		
		System.out.println( sc ); //
		
		Variables_02 v02 = new Variables_02();
		System.out.println(v02);
		
		//sc.next();
		
		//--------------------------------------------------------------
		
//		sc.nextInt();
//		sc.nextLong();
		
		// sc : 키보드 입력 기능 객체
		// nextInt() : 정수값 추출하여 프로그램으로 가져오는 기능
		
		
//		System.out.print("숫자를 입력하세요 : ");
//		int data = sc.nextInt();
//		
//		System.out.println("입력된 값 : " + data);
		
		//--------------------------------------------------------------
		
		//sc.close(); 입력 받기 전에 사용하면 오류남
		System.out.println("-------------------");
		
		System.out.print("실수값 입력 : ");
		System.out.println("입력한 실수 : " + sc.nextDouble());
		// 출력을 하려면 입력이 있어야 하므로 두번째 코드를 
		// 출력하기 위해서 입력값을 기다림
		
		// 자원 해재(반납)
		// -> 프로그램에 연결해서 사용하던 자원(키보드)의 사용 종료
		sc.close();
		
	}
}

package java03_scanner;

import java.util.Scanner;

public class Scanner_02 {
	public static void main(String[] args) {
		
		// 문자열(String) 입력 받기
		
		//1. 입력객체 변수 선언 - java.util.Scanner(참조형)
		Scanner in;
		
		//2. 입력객체 생성, 입력기능 활성화 - new
		in = new Scanner(System.in);
		
		//3. 문자열(String) 입력 - nextLine() 메서드
		System.out.print("문자열 입력 : ");
		String str = in.nextLine(); //데이터 타입은 마우스 갖다대면 나옴
		
		//4. 입력받은 문자열 출력
		System.out.println("입력한 문자열 : " + str);
		
	}
}

package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_v3 {
	public static void main(String[] args) {
		// - 메뉴 만들기
		//
		// ===============================
//		      M  e  n  u
		// ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
		// ===============================
		//
//		     >> _
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

		Scanner sc = new Scanner(System.in);
		
		// 메뉴 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 2;
		final int EXIT_MENU = 4;
		
		int menu;

		do {
			
			System.out.println("------------------");
			System.out.println("메\t뉴\t판");
			System.out.println("1. Hello World 출력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 성별 출력");
			System.out.println("4. 종료");
			System.out.println("------------------");
			
			System.out.println("MENU(exit : 4)");
			System.out.print("\t >> ");
			menu = sc.nextInt();

			System.out.print("\t >> ");
			
			// RunMenu객체 활성화
			// -> RunMenu클래스의 기능을 사용할 수 있도록 연결
			RunMenu rm = new RunMenu();
			
			// 메소드 호출 테스트
			// rm.banana();
			
			switch (menu) {
			case 1: // Hello World 출력
			//case HELLO_MENU : // 가독성이 좋음
				rm.printHello();
				break;
			case 2: // 이름 출력
				rm.printName();
				break;
			case 3: // 성별 출력
				rm.printGender();
				break;
			case 4: // 종료
				rm.printExit();
				break;
			default : 
				System.out.println("잘못된 메뉴 입력");
				break;
			}
			
		} while(menu != EXIT_MENU);
		
	}
}

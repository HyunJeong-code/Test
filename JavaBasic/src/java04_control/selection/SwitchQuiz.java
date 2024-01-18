package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz {
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

		while (true) {
			System.out.println("------------------");
			System.out.println("메\t뉴\t판");
			System.out.println("1. Hello World 출력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 성별 출력");
			System.out.println("4. 종료");
			System.out.println("------------------");
			
			// 메뉴 번호 상수
			final int HELLO_MENU = 1;
			final int NAME_MENU = 2;
			final int GENDER_MENU = 2;
			final int EXIT_MENU = 4;
			
			System.out.println("MENU(exit : 4)");
			System.out.print(">> ");
			int menu = sc.nextInt();

			System.out.print("\t >> ");
			
			switch (menu) {
			case 1: // Hello World 출력
			//case HELLO_MENU : // 가독성이 좋음
				System.out.println("Hello World!");
				break;
			case 2: // 이름 출력
				System.out.println("Alice");
				break;
			case 3: // 성별 출력
				System.out.println("여");
				break;
			case 4: // 종료
				break;
			default : 
				System.out.println("잘못된 메뉴 입력");
				break;
			}
			if (menu == 4)
				break;
		}

	}
}

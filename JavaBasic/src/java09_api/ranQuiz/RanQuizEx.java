package java09_api.ranQuiz;

import java.util.Random;

public class RanQuizEx {
	public static void main(String[] args) {
		
		// 랜덤 퀴즈 메뉴 만들기
		// 1. Up&Down 게임
		// 2. Baskin 31 게임
		// 3. 종료
		
		Random ran = new Random();
		
		int num = 0;
		
		RanQuiz ranQuiz = new RanQuiz();
		
		//-------------------------------
		
		// 게임 실행 메소드
		do {
			num = ran.nextInt(3) + 1;
			System.out.println("랜덤 뽑기 값은 >> " + num);
			
			if(num == 1) {
				System.out.println("Up & Down 게임을 시작합니다.");
				System.out.println("----------------------------");
				ranQuiz.updown();
			} else if(num == 2) {
				System.out.println("Baskin31 게임을 시작합니다.");
				System.out.println("----------------------------");
				ranQuiz.baskin();
			} else {
				break;
			}
		}while (true);
		
		
//		ranQuiz.updown();
		
//		ranQuiz.baskin();
	}
}

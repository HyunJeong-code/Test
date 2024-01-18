package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//Quiz
		//구구단 2단 출력하기
		
		// 반복횟수 : 9번
		// 반복구간 : 1 ~ 9
		
		// 수행작업 : i값 출력, i * 2 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2 * i));
		}
		
//		final int dan = 2; //안바뀐다는 것을 강조
		
		int dan = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
//		for(int i = 0; i < 9; i++) {
//			System.out.println("2 x " + (i + 1) + " = " + 2 * (i+1) );
//		}
	}
}

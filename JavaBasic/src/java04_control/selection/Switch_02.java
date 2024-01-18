package java04_control.selection;

public class Switch_02 {
	public static void main(String[] args) {
		
		int num = 30;
		
		if(num == 10) {
			System.out.println("10 이다.");
		} else if(num == 20) {
			System.out.println("20 이다.");
		} else if(num == 30) {
			System.out.println("30 이다.");	
		} else {
			System.out.println("10, 20, 30 아니다.");
		}
		
		//----------------------------------------------
		
		int score = 88;
		
		//점수 비교시에는 switch는 불가
		
		if(score >= 90) {
			System.out.println("A");
			
		} else if(score >= 80 ) { //&& score < 90가 이미 포함된 문장(else안에 들어있음)
			System.out.println("B");
			
		} else if(score >= 70) {
			System.out.println("C");	
		}
		
		//-----------------------------------------------
		
		score = 99;
		
		switch(score / 10) { //10의 자리 숫자 추출
//		case 10 : 
//			System.out.println("A");
//			break;
		case 10 : 
		case 9 : 
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		}
		
		// 숫자들의 자리수를 왼쪽(일의 자리)부터 떼어낸다.
		// num = 1234;
		
		// num % 10 -> 4
		// num /= 10
		// num% 10 -> 3
	}
}

package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {
		
		// 과거 버전 중에서는 String도 안되는 경우도 있음
		
		//에러, 비교 대상값이 너무 많음
//		double d = 3.14;
//		
//		switch( d ) {
//		
//		}
		
		//----------------------------------------------
		
		char alpha = 'B';
		
		switch(alpha) {
		case 'A' : 
			System.err.println("사과");
			break;
		case 'B' : 
			System.out.println("바나나");
			break;
		}
		
		System.out.println("--------------------");
		
		// String타입은 switch구문에서 사용 가능
		// JDK 1.7 이상
		String str = "Banana";
		
		switch(str) { // 변수
		case "Apple" : //상수
			System.err.println("사과입니다.");
			break;
		case "Banana" : //상수
			System.out.println("바나나입니다.");
			break;
		}
		
		System.out.println("--------------------");

		String str1 = "Cherry"; //상수 활용
		String str2 = new String("Cherry"); //객체 활용
		
		// String 비교는 '=='로 안됨
		System.out.println(str1 == str2); 
		
		// .eqals() 를 이용하여 비교 -> 각각의 글자들을 비교
		System.out.println(str1.equals(str2));
		
		System.out.println("--------------------");
		
		if(str2.equals(str1)) {
			System.out.println("두 문자열이 똑같다!");
		}
		
		
		
	}
}

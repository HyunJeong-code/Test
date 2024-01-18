package java05_array.array;

public class Array_04 {
	public static void main(String[] args) {
		
		//문자열, String
		// 내부 데이터 처리로 char[]와 비슷한 구조 이용
		
		// char[]와 String이 같은 타입은 X
		//----------------------------------------------
		
		String str = "AppleBanana"; //문자열
		
		char[] chArr = { 'A', 'p', 'p', 'l', 'e' }; //문자(char) 배열
		
		//--------------------------------------------
		
		System.out.println("문자열의 길이 : " + str.length());
		
		System.out.println("char[]의 길이 : " + chArr.length);
		
		System.out.println("--------------------");
		
		System.out.println("문자열의 3번째 글자 : " + str.charAt(3));
		
		System.out.println("char[] 2번째 인덱스 : " + chArr[2]);
		
		char[] converted = str.toCharArray();
		
		for (int i = 0; i < converted.length; i++) {
			System.out.println(converted[i]);
		}	
		
		System.out.println("--------------------");
		
		String str2 = new String(converted);
		System.out.println(str2);
		
		String str3 = new String(chArr);
		System.out.println(str3);
		
	}
}

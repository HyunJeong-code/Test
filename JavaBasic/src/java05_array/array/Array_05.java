package java05_array.array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열
		String str = "Apple";
		
		//---------------------------------
		
		//String 배열
//		String[] strArr; // 쓰레기값 들어있음
		
		String[] strArr = null;
		
		strArr = new String[3];
		
		strArr[0] = "Apple";
		
		System.out.println(strArr[1]);
		
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		// 전체 문자열 출력
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println(strArr[i].length());
			
			System.out.println("------");
		}
		
		// strArr - > String[]
		// strArr.length -> 배열의 길이 (3개의 문자열)
		
		// strArr[i] -> String
		// strArr[i].length() -> i 인덱스 문자열의 길이
	}
}

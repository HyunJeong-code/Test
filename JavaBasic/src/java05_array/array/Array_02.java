package java05_array.array;

public class Array_02 {
	public static void main(String[] args) {
		
		int[] arr1; // 배열 변수 선언
		arr1 = new int[7]; // 배열 요소 생성
		
		//int[] arr2 = new int[13];
		char[] arr2 = new char[13]; // 한 번에 선언(많이 사용)
		
		for(int i = 0; i < 13; i++) {
			
			// 모든 요소가 기본값 0으로 초기화
			System.out.println(i + "인덱스 : " + arr2[i]);
		}
		
		//** 데이터 타입들의 기본값
		//	정수 - 0
		//	실수 - 0.0
		//	논리 - false
		//	문자 - '\0' (null문자 - ASCII코드 0번
		
		//	참조 - null
		
		//---------------------------------------------------
		
		// 선언과 동시에 초기화
		
		int num = 100;
		
		//---------------------------------------------------
		
		// 배열 요소를 생성하고 동시에 초기화
		
		int[] arr3 = { 1, 2, 3, 4, 5 };
		
//		arr3 = new int[5];
//		arr3[0] = 1;
//		arr3[2] = 2;
//		arr3[3] = 3;
//		arr3[4] = 4;
//		arr3[5] = 5;
		
		//에러, 배열 초기화는 배열을 선언할 때만 사용 가능
//		arr3 = { 100, 200 };
		
		//---------------------------------------------------
		
		char[] chArr = { 'A', 'p', 'p', 'l', 'e' };
		
		double[] dArr = { 1.1, 2.2, 3.3, 4 }; // 자동형변환
		
		boolean[] bArr = { true, true, false };
		
	}
}

package java05_array.array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = { 3, 432, 452342, 2312, 4354521, 4545, 12 };
		
		//**배열의 길이
		// 요소의 개수
		// 배열의 크기
		// -> 배열이름.length
		
//		arr.length;
		
		//---------------------------------------------------
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("----------------------------");
		
		//배열의 모든 요소 출력하기 - for
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//---------------------------------------------------
		
		//for타이핑, ctrl + space
		// -> fo문 자동완성에 배열의 길이만큼으로 추천됨
		
	}
}

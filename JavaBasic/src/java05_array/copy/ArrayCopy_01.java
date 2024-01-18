package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		// 기본 타입 변수의 값 복사
		int num1 = 100;
		int num2;
		
		// num1 변수의 값이 num2에 복사됨
		num2 = num1; // 변수의 값만 꺼내와서 대입
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		System.out.println("--------------------------------");
		
		// 배열 복사하기 (참조형)
		
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		//배열 복사(얕은 복사)
		arr2 = arr1;
		
		//** 얕은 복사, Shallow Copy
		// 참조 대상의 참조값(주소)만 복사되는 현상
		// 실 사용 데이터를 저장하고 있는 내부 공간이 복사되지 않음
		
		// 원본 변수, 사본 변수 모두 같은 메모리 주소를 참조
		
		// -> 원본, 사본 참조형이 같은 공간을 참조하기 때문에
		// 한 쪽을 변경하면 둘 모두 변경
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(i + " : " + arr1[i] + " - " + arr2[i]);
		}
		
		arr2[1] = 99999;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(i + " : " + arr1[i] + " - " + arr2[i]);
		}
		
		System.out.println("arr1 : " + arr1 + ", arr2 : " + arr2);
	}
}

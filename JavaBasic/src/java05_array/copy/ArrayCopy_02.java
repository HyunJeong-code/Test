package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		int[] arr1 = { 50, 60, 70 };
		int[] arr2;
		
		// 1. 데이터가 복사될 공간을 새롭게 생성
		
		arr2 = new int[arr1.length];
		
		// 2. 데이터를 복사
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		//** 깊은 복사, Deep Copy
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		// 원본과 사본이 서로 분리된 별개의 공간을 가짐
		
		System.out.println("arr1 : " + arr1 + ", arr2 : " + arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		arr2[1] = 9999;
		
		System.out.println("---------------");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);			
		}
	}
}

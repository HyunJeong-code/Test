package java05_array.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		//버블 정렬
		//--------------------------------
		
		int[] arr = { 3, 2, 5, 4, 1};
		
		//----원복 출력------
		
		System.out.println("-----정렬 전-----");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		//---- 버블 정렬 수행 ----
		
		//전체 회차 진행
		for(int i = 0; i < arr.length; i++) {
			//각 회차 방법
			for(int j = 0; j < arr.length - i - 1; j++) {
				
				//스왑 - 인접한 요소를 비교하고 왼쪽이 크면 스왑
				if(arr[j] > arr[j + 1]) {
				//if(arr[j] < arr[j + 1]) // 내림차순
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		
		//----결과 출력------
		
		System.out.println("-----정렬 후-----");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		System.out.println("-----------------------");
		
		int[] arr2 = { 334, 25, 123, 534, 2312, 5654, 21 };
		
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
	}
}

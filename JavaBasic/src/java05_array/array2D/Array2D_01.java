package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		// 2차원 배열
		
		int num; 		// int형 변수 선언 				-> 정수값 1개 저장
		
		int[] arr1D; 	// int형 배열 변수 선언 		-> 정수값 여러 개 저장
		
		int[][] arr2D;	// int형 2차원배열 변수 선언	-> int[] 여러 개 저장
		// -> ((정수값)의 여러 개 묶음)을 한 번 더 여러 개로 포장한 것
		
		int[][][] arr3D;
		int[][][][] arr4D;
		int[][][][][] arr5D;
		
		//---------------------------------------------------
		
		int[] testArr = new int[9]; // int형 9개
		
		int[][] data = new int[3][4]; // int형 4개씩 3묶음 (뒤쪽부터 파악하기!)
		// 3행 4열
		
		//-------------------------------------
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성 - new 연산자
		arr = new int[3][2];
		
		arr[1][0] = 55555;
		
		System.out.println(arr[1][0]);
		
		//-------------------------------------
		
		int[] a1; // 추천
		int a2[];
		
		//int[]a1; //인식 가능 - 가독성 때문에 띄어쓰기 꼭 하기
		//inta1[]; // 에러
		
		int[][] a3; // 추천
		int a4[][];
		int[] a5[];
		
	}
}

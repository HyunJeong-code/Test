package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		// int형 2차원 배열 변수 선언
		int[][] arr;
		
		//(int배열)[] arr;
		
		//arr = new int[][];

		//arr = new (int배열)[];
		
		arr = new int[3][];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//------------------------------------------
		
		// 1차원 배열 타입 = 1차원 배열 타입으로 초기화
		arr[0] = new int[5]; // 0행 배열 생성
		arr[1] = new int[3]; // 1행 배열 생성
		arr[2] = new int[7]; // 2행 배열 생성
		
		System.out.println(arr.length);
		System.out.println(arr[0].length); // int[0]의 길이(0행의 길이) -> 5
		System.out.println(arr[1].length); // int[1]의 길이(1행의 길이) -> 3
		System.out.println(arr[2].length); // int[2]의 길이(2행의 길이) -> 7
		
		// arr 배열의 행과 열을 이용하여 모두 출력!
		
		for(int i = 0; i < arr.length; i++) { // i행, 0 ~ arr.length - 1
			for(int j = 0; j < arr[i].length; j++) { // j열, 0 ~ arr[i].length - 1
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

package java05_array.array;

public class Array_Quiz_02 {
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		int[] invert_arr = new int[arr.length];
		
		int index = arr.length - 1;
		
		System.out.print("Q1. invert_arr : ");
		for(int i = 0; i < arr.length; i++) {
			invert_arr[i] = arr[index--];
			System.out.print(invert_arr[i] + ", ");
		}
		
		System.out.println("-------------------------");
		
		int sumE = 0;
		int sumO = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) sumE += arr[i];
			else sumO += arr[i];
		}
		
		System.out.println("Q2. 짝수 인덱스 합 - 홀수 인덱스의 합 : " + (sumE - sumO));
		
		System.out.println("-------------------------");
				
		int[] rank_arr = new int[arr.length];
			
		for(int i = 0; i < arr.length; i++) {
			rank_arr[i]++;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) rank_arr[i]++;
			}
		}
		
		System.out.print("O3의 답은 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(rank_arr[i] + ", ");
		}
		System.out.println();
		
		int[] over_arr = new int[10];
		int[] ret_arr = new int[10];
		
		int k = 0;
		int l = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int check = 0;
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				else {
					if(arr[i] == arr[j]) check++;
				}
			}
			
			if(check == 0) {
				boolean ch = false;
				for(int j = 0; j < k; j++) {
					if(arr[i] == ret_arr[j]) {
						ch = true;
					}
				}
				if(ch == false) ret_arr[k++] = arr[i];
			} else {
				boolean ch = false;
				for(int j = 0; j < l; j++) {
					if(arr[i] == over_arr[j]) {
						ch = true;
					}
				}
				if(ch == false) over_arr[l++] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(over_arr[i] >= over_arr[i+1]) {
				int tmp = over_arr[i];
				over_arr[i] = over_arr[i + 1];
				over_arr[i + 1] = tmp; 
			}
			
			if(ret_arr[i] >= ret_arr[i+1]) {
				int tmp = ret_arr[i];
				ret_arr[i] = ret_arr[i + 1];
				ret_arr[i + 1] = tmp; 
			}
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Q4");
		
		System.out.println("Over_arr : ");
		for(int i = 0; i < arr.length; i++) {
			if(over_arr[i] != 0) System.out.print(over_arr[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("ret_arr : ");
		for(int i = 0; i < arr.length; i++) {
			if(ret_arr[i] != 0) System.out.print(ret_arr[i] + ", ");
		}
		
	}
}

package java04_control.loop;

import java.util.Scanner;

public class programmers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int cnt = 1;

		int i = 0;
		int j = 0;
		int s = 0;
		int e = n;
		
//		while(cnt < (n * n) + 1) {
//			if(i == s) {
//				arr[i][j] = cnt++;
//				if(j < e) j++;
//				else i++;
//			}
//			if(i == e) {
//				arr[i][j] = cnt++;
//				if(j > s) j--;
//				else {
//					i--;
//					e--;
//				}
//			}
//			if (j == s) {
//				arr[i][j] = cnt++;
//				if(i > s) i--;
//				else {
//					j++;
//					s++;
//				}
//			}
//			if (j == e) {
//				arr[i][j] = cnt++;
//				if(i < e) i++;
//				else j--;
//			}
//		}
		
		for(int l = 0; l < n; l++) {
			for(int k = 0; k < n; k++) {
				System.out.println("[ " + l + ", " + k +"] ");
			}
		}
	}
}

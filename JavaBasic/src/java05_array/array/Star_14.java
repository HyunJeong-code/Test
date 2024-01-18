package java05_array.array;

import java.util.Scanner;

public class Star_14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int STAR = sc.nextInt();
		
		for(int i = 0; i < (STAR) / 2 + 1; i++) {
			for(int j = 0; j < (STAR) / 2 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

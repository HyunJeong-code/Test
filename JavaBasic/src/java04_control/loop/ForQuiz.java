package java04_control.loop;

import java.util.Scanner;

public class ForQuiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Q1 - inputnumber : ");
		int num = sc.nextInt();
		
		// Q1
		for(int i = 1; i < 10; i++) {
			System.out.println("Q1의 답 : " + num + " x " + i + " = " + num*i);
		}
		
		
		//Q2
		System.out.print("Q2의 답 : ");
		for(int i = 1; i < num; i++) {			
			if(num % i == 0) {
				System.out.print(i + ", ");				
			}
		}
		
		
		//Q3
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		
		System.out.println("Q3의 답 : " + "4와 6으로 나눴을 때 나머지가 1인 수의 합 : " + sum);
		
		//Q4
		
		System.out.print("num1 : ");
		int n1 = sc.nextInt();
		System.out.print("num2 : ");
		int n2 = sc.nextInt();
		
		int max = 0; // 최소공배수
		int min = 0; // 최대공약수
		
		if(n1 == 1 || n2 == 1) min = 1;
		else {
			for(int i = 2; i <= n1; i++) {
				if(n1 % i == 0) {
					for(int j = 2; j <= n2; j++) {
						if(n2 % i == 0 && i == j) {
							min = j;
							break;
						}
					}
				}
			}
		}
		
		if(min == 0) min = 1;
		max = (n1 * n2) / min;
		System.out.println("---Q4의 답---");
		System.out.println("최대공약수 : " + min);
		System.out.println("최소공배수 : " + max);
		
		
		//Q5
		
		System.out.print("Q5 - inputnumber : ");
		
		int n = sc.nextInt();
		
		System.out.print("소수는 : ");
		
		for(int i = 2; i < n; i++) {
			int cnt = 0;
			for(int j = i - 1; j > 1; j--) {
				if(i % j == 0) cnt++;
			}
			
			if(cnt == 0) System.out.print(i + ", ");
		}
		
		System.out.println();
	}
}

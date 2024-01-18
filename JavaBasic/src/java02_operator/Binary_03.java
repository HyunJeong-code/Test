package java02_operator;

import java.util.Arrays;

public class Binary_03 {
	public static void main(String[] args) {
		
		// 이항연산자 - 관계, 비교
		
		// <	less than		LT
		// >	greater than	GT
		
		// <=	less than equal		LE
		// >=	greater than equal	GE
		
		// ==	equal		EQ
		// !=	not equal	NEQ
		
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교
		// 비교 연산 결과를 참/거짓으로 반환
		//		-> boolean타입을 리턴
		//		-> true / false
		//------------------------------------------------
		
		int num1 = 11;
		int num2 = 22;
		
		//에러, 
//		System.out.println("num1 == num2 : " + num1 == num2); //연산 순서의 문제
		System.out.println("num1 == num2 : " + (num1 == num2)); //EQ
		System.out.println("num1 != num2 : " + (num1 != num2)); //NEQ
		
		System.out.println("num1 < num2 : " + (num1 < num2)); //LT
		System.out.println("num1 > num2 : " + (num1 > num2)); //GT
		
		System.out.println("num1 <= num2 : " + (num1 <= num2)); //LE
		System.out.println("num1 >= num2 : " + (num1 >= num2)); //GE
		
		//------------------------------------------------
		
		boolean result = num1 == num2;
		
		System.out.println(result);
		
	}
}

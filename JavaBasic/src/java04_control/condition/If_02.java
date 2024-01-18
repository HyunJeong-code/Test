package java04_control.condition;

import java.util.Scanner;

public class If_02 {
	public static void main(String[] args) {
		
//		int num = 10;
		int num = new Scanner(System.in).nextInt();
		
		if(num == 10) {
			System.out.println("HI");
		}
		System.out.println("HELLO");
		
		//-----------------------------------------
		
		//{}중괄호 블록은 여러 개의 코드를 묶어주는 역할
		//코드 실행 흐름에는 영향 X
		
		{	
			System.out.println("Apple");
			System.out.println("Banana");
		}
		
		System.out.println("--------------------");
		
		// 제어문은 해당 제어문 다음에 오는 코드 한 개 또는
		// {}중괄호 블록 하나에 영향을 줌
		if(false)
			System.out.println("code 1"); //실행X (if영향 받음)
			System.out.println("code 2"); //실행(if영향 받지 않음)
		
		//영향받는 실행코드가 1개여도 {}중괄호로 감싸기
		
		System.out.println("--------------------");
		
		//제어문의 ()괄호 다음에 ;을 붙이지 않도록 조심
		// -> 실수로 작성하는 경우 많음
		if (false);{
			System.out.println("HI");
			System.out.println("HELLO");
			System.out.println("Hola");
		}
		
	}
}

package java12_exception;

import java.io.IOException;

public class Exception_04_throw {
	public static void main(String[] args) {
		
		// throw 키워드
		// -> 예외 상황(예왜 객체)을 발생시키는 키워드
		
		// -> 개발자가 직접 예외를 발생(throw)시키기 위해 사용
		
		//------------------------------------------------------
		
		String str = null;
		
		// 예외 발생 지점, NullPointerException
		if(str != null) {
			System.out.println(str.length());			
		} else {
			System.out.println("[EXCEPTION] 문자열이 NULL입니다.");
			
			// 예외 객체를 직접 생성하여 예외를 발생시키는 코드
			// -> 예외 상황 던지기(throw)
//			throw new NullPointerException();
		}
		
		System.out.println("-----------------");
		
		// ArithmeticException: / by zero
//		System.out.println(999/0);
		
		// 예외 정보 객체 생성
		ArithmeticException ae = new ArithmeticException();
		
		// 예외 던지기(예외 발생시키기)
//		throw ae;
		
		//** 예외 객체를 생성(new)하는 것은 예외를 발생(throw)시키지 않음
		
		//** new, throw 동작은 별개
		
		//------------------------------------------------
		
		//** throw코드와 new코드를 한꺼번에 적는게 좋음
		
//		throw new ArithmeticException();
//		throw new ArithmeticException("문제 상황 설명을 적는다.");
		
		//------------------------------------------------
		
		try {
			// Checked Exception - try ~ catch 구문 필수
			throw new IOException();
		} catch (IOException e) {
			
		}
		
	}
}

package java11_generic;

// 일반 클래스
class Class03 {
	
	// 일반 메소드 -> <T> 적용 -> 제네릭 메소드
	// 제네릭을 적용하고 사용하지 않아도 문법 오류 X
	public <T> void display(int num) {
		double dNum;
	}
	
	// 제너릭 메소드
	public <T> T out (T obj) {
		T data = obj;
		
		return data;
	}
}

public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		// 일반 클래스 생성
		Class03 cl = new Class03();
		
		// 메소드 호출 시에는 전달 인자의 데이터 타입을 보고
		// 타입 파라미터를 자동으로 결정
		cl.out(12345);
		
		//--------------------------------------------
		
		cl.<Double>out(1.1);
		
		// 에러, T -> Double로 결정 후 호출
		// -> Integer타입을 Double타입으로 표현 불가
//		cl.<Double>out(1234);
		
		// ** Number은 Double와 Integer의 부모 클래스
		cl.<Number>out(1234);
		
		//--------------------------------------------
		
		cl.<Boolean>out(true);
	}
}

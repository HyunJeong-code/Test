package java06_class.variable;

public class ClassVariableEx {
	public static void main(String[] args) {
		
		ClassVariable_01 cv01;
		cv01 = new ClassVariable_01();
		
		ClassVariable_01 cv02 = new ClassVariable_01();
		
		ClassVariable_01 cv03 = null;
		// 사용하지 않을 거면, 쓰레기값보다 null이 안전
		
		cv01.setNum(12345);
		System.out.println(cv01.getNum());
		System.out.println(cv02.getNum());
		
		// 예외 발생, NullPointerException 에러
//		System.out.println(cv03.getNum());
		
		System.out.println("----------------------");
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		
		cv04.city = "Busan";
		
		System.out.println("----------------------");
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		
		System.out.println(ClassVariable_02.city);
		
		System.out.println("----------------------");
		
		ClassVariable_02.city = "Incheon";
		
		System.out.println(ClassVariable_02.city);
		
		//** 정적변수는 클래스 단위로 관리되기 때문에
		// 정적인 방법(static way)으로 사용
		
		System.out.println("----------------------");
		
		ClassVariable_03 cv06 = new ClassVariable_03();
		
		cv06.method(0, 0);
		
		System.out.println("----------------------");
		
		new ClassVariable_03().method(2, 3);

	}
}

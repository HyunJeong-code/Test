package java08_abstract.interfaceEx.multiple;

public class Child extends Parent implements Inter_01, Inter_02 {
	
	@Override
	public void out() {
		System.out.println("자식 클래스");
	}
	
	//** 다중 상속
	// 여러 개의 클래스를 상속받는 것
	
	//** 자바는 다중 상속을 금지
	// -> extends로 한 개의 클래스만 상속 가능
	
	//** 인터페이스는 다중 상속 가능
	
	//----------------------------------------------
	
	// ex)
	
	class P1 {
		public void display() {
			System.out.println("P1");
		}
	}
	
	class P2 {
		public void display() {
			System.out.println("P2");
		}
	}
	
//	class Childeren extends P1, P2 {
//		
//		@Override
//		public void display() {
//			//** 다중 상속을 허용한다면 P1, P2 클래스 중 어떤 display()를 상속받아야 하는지 결정 불가
//		}
//	}
}

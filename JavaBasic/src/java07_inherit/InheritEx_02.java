package java07_inherit;

class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2 {
	
	public String name; // 자식 클래스의 고유 멤버
	
	public void print() { // 자식 클래스의 고유 멤버
		System.out.println("자식 메소드");
	}
	
	//-------------------------------------------------
	
	// 상속받은 멤버 필드
	public int num;
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
		
//		System.out.println(num); // Child2의 num
//		System.out.println(super.num); // Parent2의 num
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		c.num = 123; // 고유멤버 num에 대입 - Child2
		
		((Parent2)c).num = 456; // 상속받은 num에 대입 - Parent2
		
		//-------------------------------------------
		
		Parent2 p = new Parent2();
		
		p.num = 789;
		
		p.display();
		c.display();
		
		System.out.println("------------------------------");
		
		//** 자바에서는 클래스 타입의 형변환이 금지
		//** 단, 자식클래스를 부모 클래스 타입으로만 형변환 가능
		// -> 자동형변환
		// Parent2 <- Child2 형변환
		
		Parent2 pc = new Child2();
		
		pc.num = 555;
		
		((Child2)pc).num = 666;
		
		System.out.println("------------------------------");
		
		// 동적 바인딩 - 인스턴스 타입인 Child2의 display()메소드를 실행
		pc.display();
//		((Child2)pc).display();
//		((Parent2)pc).display();
		
		// 에러, Parent2 타입에 print() 메소드가 존재 X
		// -> 컴파일 타임을 넘기지 못함
		// -> 문법 에러
//		pc.print();
		
		((Child2)pc).print();
		
		System.out.println("--------------------------------");
		
		//** 자식 클래스를 부모 클래스 타입으로 자동 형변환 가능
		//** 부모 타입 객체 변수에 자식 타입 인스턴스 저장 가능
		
		//** 부모 타입 객체를 자식 인스턴스 타입으로 강제 형변환
		
		Parent2 p2 = new Parent2();
		
		// 예외 발생, 부모 타입을 자식 타입으로 사용 불가(java.lang.ClassCastException)
//		((Child2)p2).display();
		
		// 예외 발생, 부모 타입을 자식 타입으로 형변환 불가(java.lang.ClassCastException)
//		Child2 c2 = (Child2)new Parent2();
//		c2.num = 123;
		
		//** ClassCastException 예외
		// -> 특정 클래스를 다른 클래스로 사용(형변환)하려고 시도할 때 발생
		// -> 부모 타입을 자식 타입으로 사용할 때도 예외 발생
		
		// -> 실행(ctrl + F11)해보기 전에는 예외 발생을 확인할 수 없으므로
		// 사전에 조심 (문법 에러는 X)
		
	}
}

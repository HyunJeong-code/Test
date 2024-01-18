package java07_inherit;

class Parent {
	String name;
	int age;
	
	public void display() {
		System.out.println("부모 클래스 메소드");
	}
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
	
	public void display(int num) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
	}
	
	//** 오버라이딩(Overriding)
	// 메소드 재정의
	// 상속받은 메소드의 기능을 재정의하는 것
	// -> 부모클래스에 정의된 리턴타입, 이름, 매개변수 형식과 같아야 함
	
	//** @Override, 어노테이션/애너테이션(Annotation)
	// 오버라이딩 규칙이 잘 지켜지는지 유효성 검사
	// 상속받은 메소드에 적용
	// 오버라이딩 문법에 맞지 않으면 문법 에러 발생
	
	//** 애너테이션/어노테이션(Annotation)
	// 코드에 부가적인 기능, 의미 등을 부여할 때 사용
	// @(at) 기호와 함께 다양한 키워드 붙여서 사용
	// 특정 동작, 문법, 코드 등을 간단히 적용할 수 있도록 되어 있음
	// @Override, @Deprecate, @Controller, @Service, @Target, @Aspect, ...
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.age = 123;
		
		p.display();
		
		System.out.println("------------------");
		
		Child c = new Child();
		
		// 상속받은 필드
		c.name = "Bob";
		c.age = 567;
		
		// 상속받은 메소드 -> 상속받아 재정의한 메소드
		c.display();
		
		// 상속받지 않은 필드
		c.score = 789;
		
		// 상속받지 않은 메소드
		c.print();
	}	
}

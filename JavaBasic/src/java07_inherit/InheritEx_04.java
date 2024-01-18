package java07_inherit;

class Parent4 {
	protected int num;
	
	public Parent4() {
		this(0);
//		this(555); // 두 번째 코드가 되므로 에러, 1개만 사용
		
		System.out.println("부모 디폴트 생성자");
		
		// 매개변수 있는 생성자를 호출하여 초기화 코드를 대신 가능
		// -> this(0);
//		this.num = 0;
	}

	public Parent4(int num) {
//		this(); // 재귀적(무한 반복)
		
		System.out.println("부모 매개변수 있는 생성자");
		this.num = num;
	}
}

class Child4 extends Parent4 {
	
	public Child4() {
		// 부모 생성자 호출 코드, super 생성자 호출
		// -> 자식 클래스의 생성자에서 부모 생성자를 호출할 때 사용
		// -> 생략해도 자식 클래스는 항상 부모 생성자를 호출(super();)하도록 되어있음
		super();
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child4(int num) {
		
		//** 자식 클래스는 기본적으로 항상 부모 디폴트 생성자를 호출
//		super();
		super(num);
		System.out.println("자식 매개변수 있는 생성자");
		
		// 상속 받은 num 필드 초기화
//		super.num = num; // 이미 구현된 기능]
		
		// 에러 안남, Child에 num필드가 없어서 super 영역에서 찾음
		this.num = num;
	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		// 디폴트 생성자 호출
		Parent4 p1 = new Parent4();
		
		System.out.println("-------------------");
		
		// 매개변수 있는 생성자 호출
		Parent4 p2 = new Parent4(222);
		
		System.out.println("-------------------");
		
		// 자식 디폴트 생성자 호출
		Child4 c1 = new Child4();
		
		System.out.println("-------------------");
		
		Child4 c2 = new Child4(0);
		
	}
}

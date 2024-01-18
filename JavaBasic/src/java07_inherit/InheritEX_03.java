package java07_inherit;

class Parent3 {
//	private int num = 111;
	protected int num = 111; // protected 접근 제한자 : 같은 패키지 + 상속된 자식
	
	public Parent3() {
		System.out.println("부모 디폴트 생성자");
		System.out.println(num);
	}
}

class Child3 extends Parent3 {
	private int num = 333; // 접근 제한 범위를 줄여쓰고 싶을 때, 
	
	public Child3() {
//		num = 222;
		
		System.out.println("자식 디폴트 생성자");
		System.out.println("this.num : " + this.num); // 자식 멤버 필드 num
		System.out.println("super.num : " + super.num); // 부모 멤버 필드 num
	}
}

public class InheritEX_03 {
	public static void main(String[] args) {
		
		Parent3 p = new Parent3();
		
		System.out.println("------------------");
		
		//** 자식 인스턴스를 생성할 때 부모 생성자 호출, 자식 생성자 호출
		// 둘 모두 수행
		Child3 c = new Child3();
	}
}

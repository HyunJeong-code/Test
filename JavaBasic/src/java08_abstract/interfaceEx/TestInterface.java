package java08_abstract.interfaceEx;

public interface TestInterface {
	
	// 인터페이스, Interface
	// 상수 멤버 필드
	// 추상 멤버 메소드
	
	//---------------------------
	
	// 상수 멤버 필드
	// -> public static final 키워드가 붙은 필드만 선언 가능
	
	public static final int NUM1 = 123;
	
	//** 선언과 동시에 초기화 필수
	
	//----------------------------
	
	//** public static final 키워드를 생략해도 모든 키워드를 자동으로 붙여서 선언
	//** 인터페이스에 필드를 선언할 때 public static final 키워드를 모두 붙여서 작성하는 것이 좋음
	
	int NUM2 = 234;
	public int NUM3 = 345;
	static int NUM4 = 456;
	public final int NUM5 = 567;
	
	//----------------------------
	
	// 추상 멤버 메소드
	
	// 에러, abstract 키워드 없이도 추상메소드로 적용
	// pulbic void method() {}
	// -> 추상메소드는 {} 중괄호가 없어야 함
	
	public void out();
	
	public abstract void display();
}

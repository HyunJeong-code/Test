package java08_abstract;

// 추상 클래스
public abstract class Person {
	
	protected String name; // 이름

	public Person(String name) {
		this.name = name;
	}	
	
	// 데이터 출력해라!
//	public void display() {}
	
	// 추상 헤서드
	public abstract void display();
}

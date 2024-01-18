package java06_class.constructor;

class Constructor_02 {
	
	// 멤버 필드
	private int n1;
	private int n2;
	
	// 모든 멤버필드를 초기화하는 매개변수 있는 생성자
	// -> 단축키 : alt + shift + s, o, enter
	public Constructor_02(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// 생성자 오버로딩
	public Constructor_02(int n1) {
//		this.n1 = n1;
//		this.n2 = 0; //안써도 0, new 하는 순간 기본값 초기화
		
		this(n1, 0);
	}
	
	// 디폴트 생성자
	public Constructor_02() {
		
		this(0, 0);
//		this.n1 = 0;
//		this.n2 = 0;
	}
	
	// 모든 멤버 필드의 값을 출력하는 일반 메소드
	public void out() {
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
	}
}

public class ConstructorEX_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons01 = new Constructor_02(111, 222);
		cons01.out();
		
		System.out.println("----------------------");
		
		Constructor_02 cons02 = new Constructor_02(333);
		cons02.out();
		
		System.out.println("----------------------");
		
		Constructor_02 cons03 = new Constructor_02();
		cons03.out();
		
		
		
	}
}

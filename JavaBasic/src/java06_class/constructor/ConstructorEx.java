package java06_class.constructor;

class Constructor {
	private int num1 = 111;
	private int num2 = 222;
	
	// 생성자
	public Constructor() {
		System.out.println("매개변수가 없는 생성자");
		System.out.println("디폴트 생성자");
		
		System.out.println("----생성자 초기화 전----");
		System.out.println("num1 : " + getNum1());
		System.out.println("num2 : " + getNum2());
		
		System.out.println("----생성자 초기화 후----");
		// 멤버필드의 값 초기화하기
		num1 = 555;
		num2 = 666;
	}
	
	// 일반 메서드 정의
	// -> 생성자 만들 때, 조심!
	// -> 생성자의 이름과 같은 일반 메소드 작성
	// -> 생성자는 반환 타입 X
//	public void Constructor() {
//		
//	}
	
	// 매개변수 있는 생성자 - 오버로딩 O
	public Constructor(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
	}
	
	// Getter, Setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}	
}

public class ConstructorEx {
	public static void main(String[] args) {
		
		// 객체 변수 선언
		Constructor cons01;
		
		// 객체 생성 - 생성자 호출
		cons01 = new Constructor();
		
		System.out.println("---------------------");
		System.out.println("num1 : " + cons01.getNum1());
		System.out.println("num2 : " + cons01.getNum2());
		
		//------------------------------------------------
		
		Constructor cons02 = new Constructor(888, 999);
		
		System.out.println("---------------------");
		System.out.println("num1 : " + cons02.getNum1());
		System.out.println("num2 : " + cons02.getNum2());
		
	}
}

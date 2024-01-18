package java06_class.variable;

public class ClassVariable_02 {
	
	// 멤버 필드 -> 인스턴스 변수
	private int num;
	
	// 멤버 필드 -> 클래스 변수, static 변수, 정적 변수
//	private static String city = "Seoul";
	public static String city = "Seoul";
	
	//** static == 정적 == 실행 전
	//** dynamic == 동적 == 실행 중
	
	//----------------------------------------------------
	
	// 정적 필드
	private static int data1; // static
	
	// 정적 메소드
	public void setData(int data1) { // dynamic
//		this.data1 = data1; // this : 자기 참조 인스턴스
		
		ClassVariable_02.data1 = data1;
	}
	
	//----------------------------------------------------
	
	// 인스턴스 변수
	private int data2 = 100;
	
	// 정적 메소드
	// -> 객체 생성없이 곧바로 호출할 수 있도록 준비
	public static void test1() {
		
		// 에러,
		// -> 정적 메소드에서 인스턴스 변수 사용 불가
		// -> 인스턴스 변수가 만들어지기 전에 실행 준비가 완료되기 때문
//		data2 = 123;
//		System.out.println(data2);
	}
	
	//----------------------------------------------------
	
	// 상수
	public static final int MAX = 1000;
	
}

package java06_class.methodQuiz;

public class MethodQuiz {
	
	// Q1. 1 ~ 100출력 기능
	
	public void print100() {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// Q2. 전달인자만큼 Hello 반복 출력
	
	public void printHello(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("HELLO");
		}
	}
	
	// Q3. 전달인자 숫자만큼 전달인자 문자열 반복 출력
	
	public void printData(int num, String str) {
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
	
}

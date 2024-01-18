package java06_class;

import java06_class.defaultTest.Class_03;

public class Main_03 {
	public static void main(String[] args) {
		
		Class_03 cl = new Class_03();
		
//		System.out.println(cl.data);
	}
}

// 같은 패키지 내에서만 부분적인 기능을 구현하기 위해서 씀
// 파일 분석이 어려워서 요새는 거의 사용 X
// 파일 이름만 보고 아래와 같은 클래스들이 있는지 알 수 없음
class Test1 {
		
}
	
class Test2 {
		
}

// 같은 클래스 내에서 public은 한 클래스만 가능 + public 클래스 이름 = 파일 이름
//public class Test3 {
//		
//}

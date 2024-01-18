package java09_api;

public class ObjectEx {
	public static void main(String[] args) {
		
		System.out.println("---- toString() ----");
		
		Point p1 = new Point(10, 20);
		
		System.out.println(p1.toString());
		
		System.out.println(p1);
		
//		System.out.println(객체 변수);
		// -> 전달인자가 객체일 경우 .toString()을 자동으로 호출
		
		System.out.println("---- equals ----");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		// == 연산자 비교
		// 동일성 비교, identity
		// 같은 객치인지 비교(같은 인스턴스 참조)
		// 객체 변수에 저장된 참조값이 같은 지 비교
		System.out.println();
		
		System.out.println("p2 == p3 : " + (p2 == p3));
		System.out.println("p2 == p4 : " + (p2 == p4));
		
		// equals() 비교
		// 동등성 비교, equality
		// 객체의 값(인스턴스 변수의 값)이 같은 지 비교
		// 기본 equals() 기능은 동일성 비교
		// 개발자가 직접 재정의하여 변수 값을 비교하도록 작성
		System.out.println();
		
		System.out.println("p2 == p3 : " + p2.equals(p3));
		System.out.println("p2 == p4 : " + p2.equals(p4));
		
		System.out.println("------------------------");
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = "Apple";
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		
		System.out.println();
		System.out.println("---- hashCode ----");
		
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println();
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		System.out.println("---- clone() ----");
		
		Point origin = new Point(33, 44);
		
		// 얕은 복사
		Point clone1 = origin;
		
		// 깊은 복사
		Point clone2 = new Point(origin.getX(), origin.getY());
		
		// clone() 복사
		try {
			Point clone3 = (Point)origin.clone();
			
			System.out.println("origin : " + origin);
			System.out.println("clone3 : " + clone3);
			
			System.out.println();
			
			System.out.println("origin : " + origin.hashCode());
			System.out.println("clone3 : " + clone3.hashCode());
		} catch (CloneNotSupportedException e) {
//			System.out.println("문제 발생");
			e.printStackTrace();
		}
				 
	}
}

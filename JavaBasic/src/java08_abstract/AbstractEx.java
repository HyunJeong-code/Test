package java08_abstract;

public class AbstractEx {
	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice", "컴퓨터");
		Student st = new Student("Bob", "자바");
		
		pf.display();
		st.display();
		
		System.out.println("------------------");
		
		// 추상 클래스 타입 객체 변수 선언 가능
		Person p1;
		
		// 에러, 추상클래스를 이용한 객체 생성(new) 불가
//		p1 = new Person("Clare");
		
		System.out.println("------------------");
		
		Person p2 = new Person("Edward") {
			
			// 일종의 상속, 익명 타입을 상속
			@Override
			public void display() {
				System.out.println("익명 (내부) 클래스");
				System.out.println("Anonymous Inner Class");
			}
		};
		
		p2.display();
		
		Person p3 = new Professor("Clare", "인공지능");
		Person p4 = new Student("Dave", "알고리즘");
		
		p3.display();
		p4.display();
	}
}

package java01_variables;

public class VariablesQuiz {
	public static void main(String[] args) {
		
		String name;
		char sex;
		int age;
		double height;
		
		name = "Alice";
		age = 99;
		sex = '남';
		height = 222.66;
		
		System.out.println("---------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("키 : " + height);
		System.out.println("---------------------");
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + sex + ", 키 : " + height);
		System.out.println("---------------------");
		//코드 가독성이 더 좋고 편집도 더 편리
		System.out.print("이름 : " + name);
		System.out.print(", 나이 : " + age);
		System.out.print(", 성별 : " + sex);
		System.out.println(", 키 : " + height);
		
		//print() 출력은 마지막에 줄바꿈 X
		
		System.out.print("AAA");
		System.out.print("BBB");
		
		//출력에서 줄바꿈을 해주는 코드
		// -> ()괄호를 비우고 println를 사용
		System.out.println();
		
		System.out.println("---------------------");
		
		System.out.println("HI HELLO HOLA");
		
		System.out.println("---------------------");
		
		System.out.println("HI\nHELLO\nHOLA"); // 개행문자 사용
		
		System.out.println("---------------------");
		
		System.out.println("Apple");
		
		System.out.print("Apple\n");
		
		System.out.print("Apple");
		System.out.print("\n");
		
		System.out.print("Apple");
		System.out.println();
		
		//**변수에 알맞은 타입을 골라
		// 이름		- 문자열 	-> String
		// 나이 	- 정수 		-> int
		// 성별 	- 단일 문자, 문자열 -> char, String
		// 키 		- 실수 		-> double
		
		//**선언하고
		//String name; //이름
		//int age; //나이
		//char gender; //성별
		//double height; //키
		
		//**대입한 후
		//name = "Bob";
		//age = 33;
		//gender = 'F';
		//height = 187.3;
		
		//**모든 변수의 데이터를 출력해보자.
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("성별 : " + gender);
//		System.out.println("키 : " + height);

		// 이름, 나이, 성별, 키

		//   출력 예시
		//   이름 : Alice
		//   나이 : 99
		//   성별 : 남
		//   키 : 222.66

		//   ex)
		//   System.out.println("이름 : " + name);
	}
}

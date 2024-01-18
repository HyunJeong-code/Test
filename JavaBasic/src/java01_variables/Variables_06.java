package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
//		System.out.println(11 + 22);
		// 각각의 값을 메모리에 올리고 연산을 한 다음 cpu에 값이 올라가고 
		// 출력을 위해서 값이 다시 Ram에 올라간다.
		
		//------------------------------------------------
		
		System.out.println(1234L);
		System.out.println(344.1234f);
		
		//------------------------------------------------
		
		//변수
		int num;
		num = 123;
		num = 456;
		num = 678;
		
		//------------------------------------------------
		
		//이름있는 상수
		//변수의 상수화
		//**이름있는 상수의 식별값은 모든 글자를 대문자로 작성
		final int MAX;
		
		MAX = 100;
		
		//에러, 상수화된 변수는 값 대입을 한 번만할 수 있다.
//		max = 200;
		
		//------------------------------------------------
		
		final int WORKING_DAY = 25;
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다.");
		
		System.out.println("이번 달 급여 : " + WORKING_DAY * 150000);
				
	}
}

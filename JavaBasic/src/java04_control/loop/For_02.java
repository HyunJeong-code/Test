package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		// i변수가 0부터 10보다 작은 동안에 1씩 증가하면서 반복
		for(int i = 0; i < 10; i++ ) { //10번 반복
			System.out.println(i); //i는 반복문 안에서만 사용 가능
		}
		
		//** for문의 초기식에서 변수를 선언하고 사용하면
		// for문의 종료 이후에는 접근 X
		// -> for문의 {}중괄호에서만 사용하고 끝나면 변수가 지워짐
		
		// => 지역변수
		
//		System.out.println("for 이후 : " + i);
		
		//--------------------------------------------------------
		
		int i;
		for(i = 0; i < 13; i++) {
			System.out.println(i);
		}
		
		// i 변수가 0부터 13보다 작은 동안 1씩 증가하면서 반복
		
		// 반복횟수 : 13번
		// 반복구간 : 0 ~ 12
		
		//--------------------------------------------------------
		
		for(i = 6; i < 11; i++) {
			System.out.println(i);
		}
		
		// i변수가 6부터 11보다 작은 동안 1씩 증가하면서 반복
		
		// 반복횟수 : 5번
		// 반복구간 : 6 ~ 10
		
	}
}

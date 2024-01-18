package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {
		
		//	 Quiz.
		//   첫날에 10원을 예금하고,
		//   다음날에는 전날의 2배를
		//   예금하는 방식으로
		//   보름(15일) 동안 저축한 금액은?
		//	      -> 327670
		
		int sum = 0;
		int money = 10;
		
		for(int i = 1; i <= 15; i++) {
			sum += money;
			//System.out.println("sum : " + sum + ", money : " + money);
			money *= 2;
			//System.out.println(i + " : " + sum);
		}
		
		System.out.println(sum);
		
		//HINT
		
		// 1. 필요 데이터 파악
		//	-> 변수 사용 목적 구분
		
		// 날짜		int day;
		// 예금액 	int money;
		// 총금액	int total;
		
		// 15일 동안
		// day 0 ~ 14, x15
		
		//3. 반복에 맞춰 수행해야하는 작업
		//		-> 중괄호 안에 작성할 코드
		
		// 예금액 2배로 증가시키기
		// 총 금액에 추가
		
		int day; // 날짜
		int money2 = 10; // 예금액
		int total = 0; // 총금액
		
		// day 0 ~ 14, x15
		
		for(day = 0; day < 15; day++) {
			// 총 금액에 추가
			total += money2;
			// 예금액 2배로 증가시키기
			money2 *= 2;
		} 
		
		System.out.println("예금 총액 : " + total + "원");
		
//		int total = 0;
//		for(int day = 0, money = 10; day < 15; total += money, money *= 2, day++);
		
		// main 변수 안에서 이루어져야함 -> 변수 선언은 가능, 실행 불가
	}
}

package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		// 1부터 10까지의 총합 구하기
		// -> 55
		//------------------------------
		
//		int sum = 1 + 2 + 3 + ~ 9 + 10;
		
		int sum = 0;
		
		// 초기식 : int i = 1; //1부터 합이니까, 1부터 시작...
		// 조건식 : i <= 10; or i < 11; -> 수행되는 중에 sum에 i값 더하기
		// 증감식 : i++ -> 1씩 증가 
		
		for(int i = 1; i < 11; i++) {
			sum += i;
//			if(i == 10) System.out.println(sum);
		}
		
		sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
			if(i == 10) System.out.println(sum);
		}
		
//		sum = 0;
//		for(int i = 0; i < 10; i++) {
//			sum += (i + 1);
//		}
		
		System.out.println(sum);
	}
}

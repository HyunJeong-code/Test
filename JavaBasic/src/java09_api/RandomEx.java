package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Random ran;
		ran = new Random();
		
		System.out.println(ran.nextInt());
		
		System.out.println("-------------------------");
		
		System.out.println(ran.nextBoolean());
		// 0.0 ~ 1.0까지 소수점 자리 표현 최대범위까지
		System.out.println(ran.nextDouble()); 
		
		System.out.println("-------------------------");
		
		System.out.println(ran.nextInt(100)); // 0부터 bound까지의 숫자를 랜덤
		
		System.out.println(ran.nextInt(100) + 1); // 1 ~ 100
		
		System.out.println(ran.nextInt(3) + 7); // 7 ~ 9
		
		System.out.println("-------------------------");
		
		for(int i = 0; i < 10; i++) {
			switch(ran.nextInt(3)) {
			
			case 0 : 
				System.out.println("가위");
				break;
			case 1 : 
				System.out.println("바위");
				break;
			case 2 : 
				System.out.println("보");
				break;
			}
		}
	}
}
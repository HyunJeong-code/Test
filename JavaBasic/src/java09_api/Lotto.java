package java09_api;

import java.util.Random;

public class Lotto {
	
	// 로또 번호 생성기
	// 1 ~ 45 범위 랜덤
	// 6개 자리
	// 중복되지 않도록
	
	//-------------------------------
	
	// 랜덤 객체
	private Random ran = new Random();
	
	public void makeLotto(int[] lotto) {
		
		for(int i = 0; i < lotto.length; i++) {
			// 로또 번호 랜덤 추출
			int num = ran.nextInt(45) + 1;
			
			//--- 중복 값 제거 ---
			// 중복 체크 플래그(flag) 변수
			boolean isExist = false;
			
			for(int j = 0; j < i; j++) { // 이전에 생성했던 랜덤 숫자들 반복
				if(num == lotto[j]) isExist = true; // 중복된 값이 이미 존재할 경우
			}
			
			// 중복값 발견
			if(isExist) {
				i--; // 반복횟수 한 번 추가하기
				continue;
			}
			//--------------------
			
			
			// 랜덤값 배열에 대입
			lotto[i] = num;
		}
	}
	
	public void makeLotto2(int[][] lotto2) {
		for(int i = 0; i < lotto2.length; i++) {
			this.makeLotto(lotto2[i]);			
		}
	}
	
}

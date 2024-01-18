package java09_api;

import java.util.Arrays;

public class LottoEx {
	public static void main(String[] args) {
		
		// 로또 번호
		int[] lotto = new int[6];
		
		Lotto l = new Lotto();
		l.makeLotto(lotto);
		
		Arrays.sort(lotto); // 정렬
		
		System.out.println(Arrays.toString(lotto));
		
		System.out.println("-------------------");
		
		int[][] lotto2 = new int[5][6];
		
		l.makeLotto2(lotto2);			
//		for(int i = 0; i < lotto2.length; i++) {
//			System.out.println(Arrays.toString(lotto2[i]));
//		}
		
		for(int[] game : lotto2) {
			System.out.println(Arrays.toString(game));
		}
		
//		int[][] lotto3 = new int[5][6];
//		
//		for(int i = 0; i < lotto3.length; i++) {
//			l.makeLotto(lotto3[i]);
//		}
//		
//		for(int i = 0; i < lotto2.length; i++) {
//			System.out.println(Arrays.toString(lotto3[i]));
//		}
	}
}

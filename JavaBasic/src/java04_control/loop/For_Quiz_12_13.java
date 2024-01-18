package java04_control.loop;

public class For_Quiz_12_13 {
	public static void main(String[] args) {
		
		//Q11
		System.out.println("Q11");
		
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				for(int j = 0; j <= i; j++ ) {
					System.out.print("*");
				}
			}else  {
				for(int j = i; j < 9; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("----------");
		
		//Q12
		System.out.println("Q12");
		
		for(int i = 0; i < 9; i++) {
			if(i < 5) {
				for(int j = 5 - i; j > 0; j--) {
					System.out.print("*");
				}
			} else { // 1, 2, 3, 4 + 5, 6, 7, 8
				for(int j = 4; j <= i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		System.out.println("----------");
	}
}

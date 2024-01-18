package java04_control.loop;

public class For_Quiz_08_11 {
	public static void main(String[] args) {
		
		//Q8
		System.out.println("Q8");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		//Q9
		System.out.println("Q9");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		//Q10
		System.out.println("Q10");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		//Q11
		System.out.println("Q11");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5 - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("----------");
	}
}

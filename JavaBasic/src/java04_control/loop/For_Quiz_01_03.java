package java04_control.loop;

public class For_Quiz_01_03 {
	public static void main(String[] args) {
		
		// Q1
		
		System.out.println("Q1");
		
		System.out.println("*****");
		
		System.out.println("------");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
		// Q2
		System.out.println("Q2");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		
		// Q3
		
		System.out.println("Q3");
		for(int i = 0; i < 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package java04_control.loop;

public class For_Quiz_04_07 {
	public static void main(String[] args) {
		
		//Q4
		
		System.out.println("Q4");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("----------");
		
		//Q5
		
		System.out.println("Q5");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		//Q6
		
		System.out.println("Q6");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + i);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		//Q7
		
		System.out.println("Q7");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j <= 9; j++) {
				System.out.print(j - i);
			}
			System.out.println();
		}
	}
}

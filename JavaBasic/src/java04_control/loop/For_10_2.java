package java04_control.loop;

public class For_10_2 {
	public static void main(String[] args) {
		
		for(int num = 1; num < 10; num++) {
			//System.out.println(num + "단");
			
			for(int dan = 2; dan < 10; dan++) {
				System.out.print(dan + " x " + num + " = " + (num * dan) + "\t");
			}
			
			System.out.println();
		}
			
	} 
} 

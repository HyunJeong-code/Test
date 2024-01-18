package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		// -> 2 ~ 9단 전부 출력
		
		int dan = 2;
		int num = 1;
		
		while(dan < 10) {
			
			if(num < 10) {
				System.out.println(dan + " x " + num + " = " + dan * num );
				num++;
			} else {
				dan++;
				num = 1;
				System.out.println("----------------");
			}
		}
		
		System.out.println("***************************");
		System.out.println("----------------");
		
		dan = 2;
		num = 1;
		
		while(dan < 10) {
			
			while(num < 10) {
				System.out.println(dan + " x " + num + " = " + dan * num );
				num++;
			}
			
			num = 1;
			dan++;
			System.out.println("----------------");
		}
	}
}

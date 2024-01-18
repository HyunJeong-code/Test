package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuiz {
	
	private Random ran = new Random();
	private Scanner sc = new Scanner(System.in);
	
	public void updown() {
		
		int com = ran.nextInt(50) + 1;
		boolean result = false;
		
		for(int i = 0; i < 7; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			int user = sc.nextInt();
			
			if(com > user) {
				System.out.println("UP");
			} else if(com < user) {
				System.out.println("down");
			} else {
				System.out.println("**User Win!, Com Lose.**" + "Com number : " + com);
				result = false;
				break;
			}
			result = true;
		}
		
		if(result) System.out.println("Com number : " + com + "\nUser Lose, Com Win!");	  
	}
	
	public void baskin() {
		
		int lastNum = 0;
		
		while(lastNum <= 31) {
			int comN = 0;
			int com = lastNum;
			
			if(com > 27 && com < 31) {
				comN = 30 - com;
			} else if (com <= 27) {
				comN = ran.nextInt(3) + 1;
			} else {
				comN = 1;
			}
			
			System.out.print("Com의 횟수 -> " + comN +"\nCom >> ");
			for(int i = 0; i < comN; i++) {
				com += 1;
				System.out.print(com + ", ");
				if(com >= 31) {
					System.out.println();
					System.out.println("**User Win**");
					break;
				}
				lastNum = com;	
			}
			
			System.out.println();
			
			if(com >= 31) break;
			
			System.out.print("말하고 싶은 숫자의 갯수 >> ");
			int numU = sc.nextInt();
			System.out.print("User >> ");
			int user = lastNum;
			for(int i = 0; i < numU; i++) {
				user += 1;
				System.out.print(user + ", ");
				if(user >= 31) {
					System.out.println();
					System.out.println("Com Win");
					break;
				}
				lastNum = user;
			}
			
			if(user >= 31) break;
			System.out.println();
		}	
	}
	
}

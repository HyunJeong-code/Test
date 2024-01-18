package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap
		// 교환, 맞바꾸기
		//--------------------------------
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("[스왑 전] : " + num1 + ", " + num2);
		
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("[스왑 후] : " + num1 + ", " + num2);
	}
}

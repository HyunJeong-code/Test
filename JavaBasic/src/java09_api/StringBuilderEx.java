package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		
//		StringBuilder sb;
		StringBuffer sb;
		
		// 에러, String 처럼 사용 X
		//sb = "Apple";
		
		sb = new StringBuffer();
		
		System.out.println("length : " + sb.length()); // 길이
		System.out.println("capacity : " + sb.capacity()); // 용량
		
		System.out.println("---- Apple 추가 ----");
		
		sb.append("Apple");
		sb.append(123);
		sb.append(true);
		
		System.out.println(sb);
		System.out.println("length : " + sb.length()); // 길이
		System.out.println("capacity : " + sb.capacity()); // 용량
		
		System.out.println("---------------------");
		
		sb.append("BananaBanana");
		
		System.out.println(sb);
		System.out.println("length : " + sb.length()); // 길이
		System.out.println("capacity : " + sb.capacity()); // 용량
		
		System.out.println("---------------------");
		
		sb.trimToSize();
		
		System.out.println("length : " + sb.length()); // 길이
		System.out.println("capacity : " + sb.capacity()); // 용량
		
	}
}

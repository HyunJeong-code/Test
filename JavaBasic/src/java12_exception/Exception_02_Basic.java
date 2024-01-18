package java12_exception;

public class Exception_02_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i = 0;
		
			
			try {
				while(true) {

					arr[i] = i+1;	
					i++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// sysout - 표준 출력 스트림 - 콘솔에 검은 글자로 출력
//				System.out.println("[SYSTEM] 인덱스 범위를 벗어났습니다.");
				
				// syserr - 표준 에러 스트림 - 콘솔에 빨간 글자로 출력
				System.err.println("[SYSTEM] 인덱스 범위를 벗어났습니다.");
				
				// 예외 상황 출력 (Method Call Stack Trace 출력)
//				e.printStackTrace();
			} finally {
				System.out.println("예외 처리 이후 무조건 출력");
			}
			
			System.out.println("시스템 종료");
	}
}

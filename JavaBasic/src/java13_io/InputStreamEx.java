package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		
		// 키보드 표준 입력 스트림 객체
		InputStream is = System.in;
//		
//		System.out.print("Input >> ");
//		
//		try {
//			//** 키보드 입력 완료는 enter 키를 누름
//			//** enter 키는 '\r', \'n'으로 전달
//			//** -> ASCII 13, ASCII 10
//			
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read()); // 13
//			System.out.println(is.read()); // 10
//			System.out.println(is.read()); // -1
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//--------------------------------------------
		
//		public int read(byte[] b) throws IOException
		
		// 입력 데이터 저장소
		// -> read()메소드의 매개변수로 사용
//		byte[] buf = new byte[10];
		byte[] buf = new byte[1024]; // 1024정도의 타이핑이 필요
		
		// 입력 데이터의 길이
		// -> read() 메소드의 반환값을 저장
		// -> read() 메소드의 반환값이 -1일 경우 스트림의 끝(EOF)에 도달한 것
//		int len = 0;
		int len = -1;
		
		// 입력한 전체 데이터를 문자열로 저장하는 객체
		StringBuilder sb = new StringBuilder();
		
		// 입력한 문자열의 전체 길이
		int total = 0;
		
		System.out.println("<< 입력 대기 중 >>");
		
		try {
			// 입력 받을 데이터가 스트림에 남아있다면 반복해서 입력
			// -> 한 번 입력에 buf 배열의 크기만큼 수행
			// -> EOF(입력데이터의 끝)를 만날 때까지 입력을 반복
			while((len = is.read(buf)) != -1) {
				
				// 키보드 스트림의 EOF 입력
				// 윈도우 : ctrl + z
				// 맥 : command + d
				//-------------------------
				
//				System.out.println(Arrays.toString(buf));
				// 출력하면 개행 2번과 그 사이에 byte배열에 남은 공간 빈칸이 출력됨
//				System.out.println(new String(buf));
//				System.out.println(new String(buf, 0, len));
				
				//-------------------------
				
				// read()가 입력받은 전체 문자열을 StringBuilder에 반복해서 추가
				sb.append(new String(buf, 0, len));
				
				// read()가 입력받은 전체 문자열의 길이를 계산(총합)
				total += len;	
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 안전하게 닫기
				// null이면 만든적이 없기 때문에 닫을 필요 X
				// 스트림 닫기
				// -> 스트림이 사용하던 시스템 자원을 반환
				// -> 자원 해제 코드
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("<< 전체 입력받은 데이터 >>");
		System.out.println(sb);
		
		System.out.println();
		System.out.println("<< 전체 입력받은 길이 >>");
		System.out.println(total + "B");
	}
}

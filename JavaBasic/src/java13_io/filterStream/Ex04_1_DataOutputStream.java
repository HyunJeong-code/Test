package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {
	public static void main(String[] args) {
		
		// 출력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		
		// 데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			// Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream -> File
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
			// OutputStram의 기본 출력 메소드
			// -> 1Byte 단위로 ASCII 코드를 처리
//			dos.write(65);
//			dos.write("Apple".getBytes());
			
			// DataOutputStream의 자료형 유지 출력 메소드
			// 아무것도 출력 안됨 -> 이클립스로 텍스트 편집기 기능으로 오픈
			// -> 문자를 읽음 -> 숫자 0은 null인데 null은 빈칸임
			dos.writeBoolean(false); // true - 1, false - 0, 1Byte
			dos.writeInt(123); // 4Byte
			dos.writeChar('가'); // int형을 넣어달라 하지만 ''안에 글자 넣어도 자동 변환, 2Byte
			
			// 출력 버퍼 비우기
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

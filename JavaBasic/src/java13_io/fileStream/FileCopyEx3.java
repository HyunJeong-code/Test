package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx3 {
	public static void main(String[] args) {
		
		// Quiz
		
		// Source.txt 파일의 내용을 읽어들여 Destination.txt.파일로 저장
		// -> 파일 복사
		
		// 49,520,698 bytes
		
		// Source.txt ---> FileCopy ---> Destination.txt
		
		//---------------------------------------------------
		
		File source = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("exists : " + source.exists());
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0; // 총 입출력 크기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		File destination = new File("./src/java13_io/fileStream/", "Destination3.txt");
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(destination); // 쓰기 모드
			
			while ((len = fis.read(buf)) != -1) {
				
				fos.write(buf, 0, len);
				fos.flush();
				
				// 복사된 바이트 스 총합
				total += len;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(source.length());
		System.out.println(destination.length());
		
		System.out.println(total);
	}
}

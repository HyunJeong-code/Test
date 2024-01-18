package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
	public static void main(String[] args) {
		
		// Quiz
		
		// Source.txt 파일의 내용을 읽어들여 Destination.txt.파일로 저장
		// -> 파일 복사
		
		// 49,520,698 bytes
		// 16 + 9 + 2
		
		// Source.txt ---> FileCopy ---> Destination.txt
		
		//---------------------------------------------------
		
		File source = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("exists : " + source.exists());
		
		byte[] buf = new byte[49520714];
		int len = -1;
		
		StringBuilder sb = new StringBuilder();
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(source);
			
			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));
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
		}
		
		File destination = new File("./src/java13_io/fileStream/", "Destination.txt");
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(destination); // 쓰기 모드
			
			String str = new String(buf);
			
			fos.write(str.getBytes(), 0, str.length());
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(source.length());
		System.out.println(destination.length());
		
	}
}

package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx4 {
	public static void main(String[] args) {
		
		// StringBuilder와 그냥 읽기의 용량 차이..?
		
		File source = new File("./src/java13_io/fileStream/", "text");
		System.out.println("exists : " + source.exists());
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0; // 총 입출력 크기
		
		StringBuilder sb = new StringBuilder();
		FileInputStream fis = null;
		
		File destination = new File("./src/java13_io/fileStream/", "textResult");
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(destination); // 쓰기 모드
			
			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));
				//System.out.println(len);
				total += len;
			}
			
			String str = new String(sb);
			
			fos.write(str.getBytes(), 0, sb.length());
			fos.flush();	
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
		System.out.println("exists : " + destination.exists());
		System.out.println(source.length());
		System.out.println(destination.length());
		
		System.out.println(sb.length());
		System.out.println(total);
	}
}

package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx2_2 {
	public static void main(String[] args) {

		// try ~ catch ~ with
		
		File source = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("exists : " + source.exists());
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0; // 총 입출력 크기
		
		File destination = new File("./src/java13_io/fileStream/", "Destination3.txt");
		
		try (FileInputStream fis = new FileInputStream(source);
			 FileOutputStream fos = new FileOutputStream(destination)) {
			
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
		} 
		
		System.out.println(source.length());
		System.out.println(destination.length());
		
		System.out.println(total);
	}
}

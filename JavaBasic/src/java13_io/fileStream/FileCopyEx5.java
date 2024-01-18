package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx5 {
	public static void main(String[] args) {
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0; // 총 입출력 크기
		
		InputStream is = System.in;
		OutputStream os = System.out;
		
		StringBuilder sb = new StringBuilder();
		
		try {
			
			while ((len = is.read(buf)) != -1) {
				
//				String st = new String(buf, 0, len);
//				System.out.println("st : " + st);
//				System.out.println("st.length : " + st.length());
				
				sb.append(new String(buf, 0, len));
//				System.out.println("buf.length : " + buf.length);
				System.out.println("sb.length : " + sb.length());
				total += len;
				System.out.println("len : " + len);
			}
			
			String str = new String(sb);
			System.out.println("str.length : " + str.length());
			
			os.write(str.getBytes(), 0, str.length());
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(os != null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		System.out.println("total : " + total);
	}
}

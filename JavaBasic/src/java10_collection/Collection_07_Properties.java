package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_07_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// .put() 메소드를 사용하면 Properties의 고유한 특성 이용 X
//		prop.put(true, 123123);
		
		// setProperty(), getProperty()를 이용하여 
		// 문자열 타입의 key-value 쌍을 관리
//		prop.setProperty("A", 100);
		prop.setProperty("A", "100");
		
		System.out.println(prop.getProperty("A"));
		
		System.out.println("--------------------");
		
		prop.setProperty("username", "Alice");
		prop.setProperty("password", "Ali123");
		prop.setProperty("test", "data");
		
		System.out.println(prop);
		
		System.out.println("--------------------");
		
		// Properties 객체 -> File
		
		// 파일 출력 스트림 객체
		FileWriter writer = null;
		
		try {
//			writer = new FileWriter("D:\\workspace\\JavaBasic\\src\\java10_collection\\user.properties");
			writer = new FileWriter("D:/workspace/JavaBasic/src/java10_collection/user.properties");
			// '\'만 쓰면 명령어인 줄 앎 \\씀
			// 자바 내에서는 '/'로 가능
			// 폴더 새로고침 하면 생성되어 있음
			
			prop.store(writer, "command: User Information");
			
			// 스트림 닫기
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 입력 스트림 객체
		FileReader reader = null;
		
		// 입력받은 데이터 확인할 Properties 객체
		Properties test = new Properties();
		
		System.out.println("test : " + test);
		
		try {
			reader = new FileReader("D:/workspace/JavaBasic/src/java10_collection/user.properties");
			
			// 파일에서 데이터 입력 받기
			test.load(reader);
			
			System.out.println("---- 불러온 후 ----");
			System.out.println("test : " + test);
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 자바 API에서 제공하는 기본 시스템 프로퍼티(속성)
		
		Properties sysProp = System.getProperties();
		
		System.out.println(sysProp);
		
		System.out.println("---- 자바 정보 ----");
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("java.vendor"));
		
		System.out.println("---- OS 정보 ----");
		System.out.println(sysProp.getProperty("os.name"));
		
	}
}

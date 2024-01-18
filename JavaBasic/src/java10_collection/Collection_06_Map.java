package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_06_Map {
	public static void main(String[] args) {
		
		// 맵 객체 생성
//		Map map = new HashMap();
		Map map = new Hashtable();
		
		// 데이터 삽입
		System.out.println("---- put( key, value) ----");
		
		map.put("a", "Apple");
		map.put(200, "Banana");
		map.put(true, 3.124512);
		
		System.out.println(map);
		
		// 데이터 조회
		System.out.println("---- get( key, value) ----");
		
		System.out.println(map.get(200));
		System.out.println(map.get(true));
		
		System.out.println("---- 중복된 키 ----");
		
		// 기존에 존재하는 매핑된 Value를 변경
		map.put(true, "Durian");
		System.out.println(map);
		
		// 중복된 Value는 상관없이 삽입
		System.out.println("---- 중복된 값 ----");
		map.put(500, "Apple");
		
		System.out.println(map);
		
		System.out.println("---- contains ----");
		
		System.out.println("Key 5 : " + map.containsKey(5));
		
		// 존재하지 않는 key를 이용하요 get() 호출 시 null 반환
		System.out.println("get(5) : " + map.get(5));
		
		System.out.println("Value \"Apple\" : " + map.containsValue("Apple"));
		
		System.out.println("---- size ----");
		System.out.println("크기 : " + map.size());
		
		System.out.println("---- isEmpty ----");
		System.out.println("비었는가 ? " + map.isEmpty());
		
		System.out.println("---- remove -----");
		map.remove(200);
		
		// key를 찾아서 Entry를 삭제
		System.out.println(map);
		
		// key를 찾아서 value와 같을 때, Entry에서 삭제
		map.remove(true, "Orange");
		System.out.println(map);
		
		map.remove("a", "Apple");
		System.out.println(map);
		
		System.out.println("---- null 데이터 처리----");
		
		// HashMap은 key, value가 null인 상황은 에러는 아니지만 추천 X
		// Hashtable은 key, value로 null값을 허용 X
		map.put(null, "Bob");
		map.put(900, null);
		
		System.out.println(map);
		
		System.out.println("---- map <-> set ----");
		
		Set keySet = map.keySet(); // key를 추출하여 set으로 반환
		
		Set entrySet =  map.entrySet(); // entry를 추출하여 set으로 반환
		
		System.out.println("keySet : " + keySet);
		
		System.out.println("entrySet : " + entrySet);
		
		System.out.println("-------------");
		
		Iterator keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Object data = map.get(keyIter.next());
			
			System.out.println(data);
		}
		
	}
}

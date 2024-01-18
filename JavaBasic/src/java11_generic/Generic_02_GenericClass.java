package java11_generic;

// 제네릭 클래스
class Class02<T> {
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

//class Class03 {
//	private double data;
//	
//	public double display(double data) {
//		this.data = data;
//		return data;
//	}
//	
//	public double getData() {
//		return data;
//	}
//	
//	public void setData(double data) {
//		this.data = data;
//	}
//}

public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
		// 타입 파라미터를 결정하지 않음
		// -> Object 타입으로 자동 결정
		// -> raw type
		Class02 c01 = new Class02();
		
		c01.setData(12345);
		
		int num = (int) c01.getData();
		
		//------------------------------------------
		
		Class02<String> c02 = new Class02();
		
		c02.setData("Grape");
		
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
	}
}

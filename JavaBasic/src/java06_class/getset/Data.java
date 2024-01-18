package java06_class.getset;

public class Data {
	
	private int num; // 번호
	private String name; // 이름
	private String phone; // 전화번호 - 문자열로 꼭 처리..!
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	// Setter 메소드
//	// -> 외부 객체에서 호출을 통해 멤버 필드의 값을 대입(저장) 가능
//	public void setNum(int num) { // 멤버 필드의 이름과 똑같이 적는 것을 권장
//		// 변수명이 똑같으면 중괄호 내에서 가까운 변수를 가르킴
////		num = num;
//		
//		this.num = num;
//	}
//	
//	//Getter 메소드
//	// -> 외부 객체에서 호출을 통해 멤버 필드의 값을 반환(불러오기) 가능
//	public int getNum() { // 멤버필드의 데이터 타입이 반환 데이터 타입
//		return num;
//
//		// 가까운 중괄호에 num이 없어서 멤버 필드에서 변수를 찾음
//		// return this.num; 이렇게 써도 됨
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	
//	public String getPhone() {
//		return phone;
//	}
	
}

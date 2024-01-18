package java12_exception.custom;

public class User {
	
	// 나이
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		if( age < 0 || age > 150) {
//			System.out.println("나이는 0 ~ 150 사이로 입력하세요.");
//			return;
			
			throw new UserAgeException();
		}
		
		this.age = age;
	}	
}

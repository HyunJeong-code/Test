package java12_exception.custom;

// 예외의 체계가 생김 -> 단, 귀찮음 -> 규모가 크지 않는 이상 안함

public class CustomException {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge(14);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
		try {
			user.setAge(-342);
		} catch (UserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

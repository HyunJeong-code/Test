package java08_abstract;

public class Professor extends Person {
	
	private String major; // 전공
	
//	public Professor(String name) {
//		super(name);
//	}

	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major + "전공");
	}
}

package java08_abstract;

public class Student extends Person {
	
	private String subject;

	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + "수강");
	}

}

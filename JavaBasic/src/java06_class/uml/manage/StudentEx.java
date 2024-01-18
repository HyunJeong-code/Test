package java06_class.uml.manage;

public class StudentEx {
	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
		
//		ss.insertInfo(); //이름과 나이 입력
		
		StudentService02 st = new StudentService02();

//		st.print();
//		st.insert();
		st.insertInfo();
		
		ss.insertScore(); //국영수 점수 입력
	
		ss.printStu(); //학생 정보 출력
//		
	}
}










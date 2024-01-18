package java06_class.uml.manage;

public class StudentEx2 {
	public static void main(String[] args) {
		
		StudentService02 st = new StudentService02();

//		st.print();
//		st.insert();
		st.insertInfo();
		
		st.insertScore(); //국영수 점수 입력
		
		st.calcSum(); // 합계, 평균 출력
	
		st.printStu(); //학생 정보 출력
//		
	}
}










package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {

	private Student stu = new Student();
	private Scanner input = new Scanner(System.in);
	
	// 생성자
	public StudentService() {
		
		// 위에서 선언만 하고 생성자에서 생성해도 됨
		// input = new Scanner(System.in);
		// stu = new Student();
	}
	
	// 메소드
	public void insertInfo() { //이름과 나이 입력
		
		System.out.print("이름 입력 >> ");
		stu.setName(input.nextLine());
		System.out.print("나이 입력 >> ");
		stu.setAge(input.nextInt());
		
//		System.out.println(stu.getAge() + ", " + stu.getName());
		
	}
	
	public void insertScore() { //국영수 점수 입력
		
		System.out.print("국어 점수 입력 >> ");
		stu.setKor(input.nextInt());
		System.out.print("영어 점수 입력 >> ");
		stu.setEng(input.nextInt());
		System.out.print("수학 점수 입력 >> ");
		stu.setMath(input.nextInt());
		
		calcSum();
//		this.calcSum(); // 같은 멤버임을 강조l
		
	}
	
	public void calcSum() {
		
		stu.setSum(stu.getEng() + stu.getKor() + stu.getMath());
		
		
		System.out.println("sum : " + stu.getSum());
		
	}
	
	public void calcAvg() {
		stu.setAvg(stu.getSum() / 3.0);
		
		System.out.println( "avg : " + stu.getAvg());
	}
	
	public void printStu() { //학생 정보 출력
		
		System.out.println("이름 : " + stu.getName());
		System.out.println("나이 : " + stu.getAge());
		System.out.println("국어 점수 : " + stu.getKor());
		System.out.println("영어 점수 : " + stu.getEng());
		System.out.println("수학 점수 : " + stu.getMath());
		
//		calcSum();
		System.out.println("합계 점수 : " + stu.getSum());
		calcAvg();
		System.out.println("평균 점수 : " + stu.getAvg());
		
	}
	
}

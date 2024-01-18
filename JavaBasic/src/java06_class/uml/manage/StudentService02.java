package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService02 {

	private Student[] stu = new Student[3];
	private Scanner input = new Scanner(System.in);
	
	// 생성자
	public StudentService02() {
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
		}
	}
	
	// 메소드
	
	public void insertInfoOne(Student stu) { //이름과 나이 입력
		
		System.out.print("이름 입력 >> ");
		stu.setName(input.nextLine());
		System.out.print("나이 입력 >> ");
		stu.setAge(input.nextInt());
		
//		System.out.println(stu.getAge() + ", " + stu.getName());
		
	}
	public void insertInfo() { //이름과 나이 입력
		
		for(int i = 0; i < stu.length; i++) {
			System.out.print("이름 입력 >> ");
			stu[i].setName(input.nextLine());
			System.out.print("나이 입력 >> ");
			stu[i].setAge(input.nextInt());
			
			// 버퍼비우기 - '\n' 제거
			input.nextLine();
			
			System.out.println(stu[i].getAge() + ", " + stu[i].getName());
			
			//this.insertInfoOne(stu[i]);
		}
		
	}
	
//	public void insert() {
//		stu[0].setName(input.nextLine());
//		
//		System.out.println(stu[0].getName());
//	}
//	
//	public void print() {
//		System.out.println(stu);
//		System.err.println(stu[0]);
//	}
	
	public void insertScore() { //국영수 점수 입력
		
		for(int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].getName() + "의 국어 점수 입력 >> ");
			stu[i].setKor(input.nextInt());
			System.out.print(stu[i].getName() + "의 영어 점수 입력 >> ");
			stu[i].setEng(input.nextInt());
			System.out.print(stu[i].getName() + "의 수학 점수 입력 >> ");
			stu[i].setMath(input.nextInt());
		}
	}
	
	public void calcSum() {
		
		for(int i = 0; i < stu.length; i++) {
			stu[i].setSum(stu[i].getEng() + stu[i].getKor() + stu[i].getMath());
			stu[i].setAvg(stu[i].getSum() / 3.0);
			
			System.out.println(stu[i].getName() + "의 sum : " + stu[i].getSum() + ", 평균 : " + stu[i].getAvg());
		}
		
	}
	
	public void calcAvg() {
		
		for(int i = 0; i < stu.length; i++) {
			stu[i].setAvg(stu[i].getSum() / 3.0);
			
			System.out.println(stu[i].getName() + "의 평균 : " + stu[i].getAvg());
		}
	}
	
	public void printStu() { //학생 정보 출력
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println((i+1) + "번 째 학생의 정보------");
			System.out.println("이름 : " + stu[i].getName());
			System.out.println("나이 : " + stu[i].getAge());
			System.out.println("국어 점수 : " + stu[i].getKor());
			System.out.println("영어 점수 : " + stu[i].getEng());
			System.out.println("수학 점수 : " + stu[i].getMath());
			System.out.println("합계 점수 : " + stu[i].getSum());
			System.out.println("평균 점수 : " + stu[i].getAvg());
			System.out.println("--------------------------------");
		}
		
	}	
}

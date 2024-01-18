package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		
		//3과목 점수 관리 프로그램
		//키보드 입력 객체
		Scanner sc = new Scanner(System.in);
		//---------------------------------------------------
		
		//   국어, 영어, 수학
		//   점수를 저장할 수 있는 변수를 만들고
		int kuk, eng, math;
		//int kuk = sc.nextInt();
		
		//   3과목 점수를 입력받는다
		System.out.println("-각 과목의 접수를 입력하세요.-");
		
		System.out.print("국어 : ");
		kuk = sc.nextInt();
		
		//System.out.println(" Test] kuk : " + kuk); //입력값 맞는지 확인
		//배포시에는 제거
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
//		System.out.print("영어 : " + (eng = sc.nextInt()));
		
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		//코드 복붙하면 신경써서 봐야함
		
		//총점 계산
		int sum = kuk + eng + math;
		
		//평균 계산
		double avg = sum / 3.0;
		//avg = (double) (kuk + eng + math) / 3;
		//avg = (kuk + eng + math) / (double) 3;
		
	    //총점과 평균을 포함한 결과를 출력한다
		
		System.out.println();
		System.out.println("-------------결과 출력--------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kuk + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		

		//동작 예시)
		   
		//===== 입력 =====
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//국어   영어   수학   총점   평균
		//100   99   97   296   98.666666667
	}
}

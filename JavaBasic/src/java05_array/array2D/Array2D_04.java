package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		// 학생 성적 관리 프로그램
		// -> 국영수 3과목 점수
		
		// 점수 1개 		-> int
		// 3과목 점수		-> int[3]
		
		// 4학생의 점수들	-> int[4][3]
		
		// 2개의 학급		-> int[2][4][3]
		
		//--------------------------------------------
		
		//QUIZ.
	    //   2명의 국어, 영어, 수학 점수를 처리하기
	    //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	    //   ** 2차원배열 이용해보기
	      
	    //   int[2][3] - 학생들 점수
	    //   int[2] - 학생들 총점
	    //   double[2] - 학생들 평균
	      
	    //----- 최종 출력 -----
	    //   번호   국어   영어   수학   총점   평균
	    //   1번      xxx      xxx      xxx      xxx      xxx.xx
	    //   2번      xxx      xxx      xxx      xxx      xxx.xx

		Scanner sc = new Scanner(System.in);
		
		int[][] stu_sco = new int[2][3];
		int[] sum = new int[2];
		double[] avg = new double[2];
		
		String[] str = { "국어", "영어", "수학" };
		
		for(int i = 0; i < stu_sco.length; i++) {
			System.out.println((i + 1) + "번째 학생 점수 입력----");
			for(int j = 0; j < stu_sco[i].length; j++) {
				System.out.print(str[j] + "의 점수 입력 >> ");
				stu_sco[i][j] = sc.nextInt();
				sum[i] += stu_sco[i][j];
			}
			avg[i] = sum[i] / 3.0; // double형으로 올바른 값을 얻기 위해서는
			// 연산의 하나의 값은 double이여야 함((유의))
		}
		
		System.out.println("----------------점수 출력----------------");
		System.out.println("번호\t국어\t영어\t수학\t총합\t평균");
		
		for(int i = 0; i < stu_sco.length; i++) {
			System.out.print((i + 1) + "번\t");
			for(int j = 0; j < stu_sco[i].length; j++) {
				System.out.print(stu_sco[i][j] + "\t");
			}
			System.out.println(sum[i] + "\t" + String.format("%.2f", avg[i]));
		}
		
	}
}

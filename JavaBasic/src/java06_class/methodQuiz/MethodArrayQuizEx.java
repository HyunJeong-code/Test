package java06_class.methodQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		
		MethodArrayQuiz maq = new MethodArrayQuiz();
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		// 1. arr배열의 모든 요소가 10배가 되도록 작성
		maq.mul10(arr);
		
		// 2. arr배열의 모든 요소가 출력되도록 작성
		maq.print(arr);
	}
}

package java06_class.methodQuiz;

public class MethodArrayQuiz {
	
	public int[] mul10(int[] tmp) {
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] *= 10;
		}
		
		return tmp;
	}
	
	// 얕은 복사
//	public void mul10(int[] tmp) {
//		for(int i = 0; i < tmp.length; i++) {
//			tmp[i] *= 10;
//		}
//	}
	
	public void print(int[] tmp) {
		for(int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
	}
}

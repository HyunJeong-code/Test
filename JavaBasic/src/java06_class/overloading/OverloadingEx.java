package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		System.out.println("----display----");
		ol.display();
		
		// (44, 55)로 출력되도록 조절
		
		ol.setX(44);
		ol.setY(55);
		
		ol.display();
		
		System.out.println("---------------------");
		
		// x, y를 11, 22로 입력하고 출력
		ol.display(11, 22);
	}
}

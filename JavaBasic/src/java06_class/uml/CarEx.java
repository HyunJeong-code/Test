package java06_class.uml;

public class CarEx {
	public static void main(String[] args) {
		
		Car car01 = new Car("Van", "white");
		
		car01.display();
		
		System.out.println("-------------------");
		
		car01.setModel("모닝");
		car01.setColor("Black");
		
		System.out.println(car01.getModel());
		System.out.println(car01.getColor());
		
		
	}
}

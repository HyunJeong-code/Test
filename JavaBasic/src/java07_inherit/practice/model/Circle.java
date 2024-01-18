package java07_inherit.practice.model;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.print("원의 중심점 : ");
		super.draw();
		double area = Math.PI * radius * radius; // 면적
		double cir = Math.PI * radius * 2; // 둘레
		
		System.out.printf("원의 면적 : %.1f \n", area);
		System.out.printf("원의 둘레 : %.1f \n", cir);
	}
	
	// 오버라이딩한 메소드를 오버로딩한 메소드
	public void draw(Circle c) {
		draw();
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
}

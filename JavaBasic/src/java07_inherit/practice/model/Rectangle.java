package java07_inherit.practice.model;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.print("사각형의 좌측 상단 좌표값 : ");
		super.draw();
		double area = width * height;
		double cir = 2 * (width + height);
		
		System.out.printf("사각형의 면적 : %.1f \n", area);
		System.out.printf("사각형의 둘레 : %.1f \n", cir);
	}
	
	// 오버라이딩한 메소드를 오버로딩한 메소드
	public void draw(Rectangle r) {
		draw();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
}

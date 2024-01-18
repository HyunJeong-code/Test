package java07_inherit.practice.controller;

import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle[] c = new Circle[3];
		Rectangle[] r = new Rectangle[3];
		
		System.out.println("Circle 클래스의 값 입력과 결과값 출력----");
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle();
			
			System.out.println((i + 1) + "번째 원의 좌표 입력");
			System.out.print("x 좌표 값 입력 >> ");
			c[i].setX(sc.nextInt());
			System.out.print("y 좌표 값 입력 >> ");
			c[i].setY(sc.nextInt());
			System.out.print("반지름 입력 >> ");
			c[i].setRadius(sc.nextInt());

			c[i].draw();
			
		}
		
		System.out.println("Rectangle 클래스의 값 입력과 결과값 출력----");
		for(int i = 0; i < r.length; i++) {
			r[i] = new Rectangle();
			
			System.out.println((i + 1) + "번째 사각형 좌표 입력");
			System.out.print("x 좌표 값 입력 >> ");
			r[i].setX(sc.nextInt());
			System.out.print("y 좌표 값 입력 >> ");
			r[i].setY(sc.nextInt());
			System.out.print("높이 값 입력 >> ");
			r[i].setHeight(sc.nextInt());
			System.out.print("너비 값 입력 >> ");
			r[i].setWidth(sc.nextInt());
		
			r[i].draw();
		}
		
		Point[] p = new Point[5];
		
//		p[0] = new Circle(1, 2, 3);
//		p[1] = new Circle(4, 5, 6);
//		p[2] = new Rectangle(1, 1, 5, 9);
//		p[3] = new Rectangle(3, 2, 7, 6);
//		p[4] = new Circle(1, 9, 5);
//		
//		for(int i = 0; i < p.length; i++) {
//			p[i].draw();
//			
//			System.out.println("------------------");
//		}
		
		for(int i = 0; i < p.length; i++) {
			if(i % 2 == 0) {
				p[i] = new Circle();
				System.out.println((i + 1) + "번째 원의 좌표 입력");
				System.out.print("x 좌표 값 입력 >> ");
				p[i].setX(sc.nextInt());
				System.out.print("y 좌표 값 입력 >> ");
				p[i].setY(sc.nextInt());
				System.out.print("반지름 입력 >> ");
				((Circle)p[i]).setRadius(sc.nextInt());

				p[i].draw();
			} else {
				p[i] = new Rectangle();
			
				System.out.println((i + 1) + "번째 사각형 좌표 입력");
				System.out.print("x 좌표 값 입력 >> ");
				p[i].setX(sc.nextInt());
				System.out.print("y 좌표 값 입력 >> ");
				p[i].setY(sc.nextInt());
				System.out.print("높이 값 입력 >> ");
				((Rectangle)p[i]).setHeight(sc.nextInt());
				System.out.print("너비 값 입력 >> ");
				((Rectangle)p[i]).setWidth(sc.nextInt());
				
				p[i].draw();
			}
		}
		
//		for(int i = 0; i < p.length; i++) {
//			if(i % 2 == 0) {
//				System.out.println("3개의 좌표값 입력-----");
//				p[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
//				p[i].draw();
//			} else {
//				System.out.println("4개의 좌표값 입력-----");
//				p[i] = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//				p[i].draw();
//			}
//		}
		
	}
}

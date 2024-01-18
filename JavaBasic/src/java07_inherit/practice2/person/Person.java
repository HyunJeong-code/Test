package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {

	private String name;
	private int money;
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product p) {
		prod = p;
		
		if(this.money - prod.getPrice() >= 0) {
			System.out.println(this.name + "님이 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + " 구매함" );
			this.money = this.money - prod.getPrice();
			System.out.println("[잔액] : " + this.money + "원");
		} else {
			System.out.println("잔액부족 - [잔액] : " + this.money);
		}
		
//		if(this.money < prod.getPrice()) return; 
		// 문제 발생 시 멈추는 방식의 개발이 더 좋음
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}

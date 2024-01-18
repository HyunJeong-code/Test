package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB {
	public abstract void getC();
}

//** 클래스가 클래스를 상속받을 때 extends
//** 인터페이스가 인터페이스를 상속받을 때 extends

//** 클래스가 인터페이스를 상속받을 때 implements

class Children implements InterC {
	
	@Override
	public void getA() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getB() {
		// TODO Auto-generated method stub
		
	}
	
@Override
	public void getC() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceEx_03 {

}

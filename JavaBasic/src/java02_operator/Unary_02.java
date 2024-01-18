package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		// 단항연산자 - 증감
		
		// 	++
		//	--
		
		// 피연산자로 적용한 변수에 저장된 값을 1증가/감소
		//------------------------------------------------
		
		int num;
		
		num = 15;
		
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		System.out.println("-----------------");
		
		num = 15;
		
		num--;
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		//------------------------------------------------
		
		//**증감 연산자는 다른 연산식과 같이 사용할 때 계산법이 달라짐
		// -> 변수의 앞에 적용했는지 뒤에 적용했는 지에 따라 다름
		
		System.out.println("-----------------");
		
		num = 15;
		
		System.out.println(num);
		System.out.println(num--); //감소연산자 적용, 후치 감소, 후위 감소
		System.out.println(num);
		
		System.out.println("-----------------");
		
		System.out.println(num);
		System.out.println(--num); //감소연산자 적용, 전치 감소, 전위 감소
		System.out.println(num);
		
		//** 전위 증감연산은 변수의 값을 불러오기 전에 증감
		//** 후위 증감연산은 변수의 값을 불러온 후에 증감
		
		//------------------------------------------------
		
		System.out.println("-----------------");
		
		num = 13;
		
		System.out.println(num++-10-++num);
//		System.out.println(13++-10-++num); //num=13
//		System.out.println(13-10-++14); //num=14
//		System.out.println(13-10-15); //num=15
		
		System.out.println("-----QUIZ1-----");
		int a = 5, b = 6, c = 10, d;
	      
	    d = ++a * b--;
	      
	    System.out.println("a=" + a + ", b=" + b + ", d=" + d);
	      
	    d = a++ + ++c - b--;
	      
	    System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
		
	    System.out.println("-----QUIZ1-----");
	    
	    a = 5; 
	    b = 6;
	    c = 10;

	    boolean res1;
	    res1 =  a < b || --a > c++; 
	    System.out.println("a=" + a + ", b=" + b + ", c=" + c);

	      
	    boolean res2;
	    res2 = c<b++ && c-->++a;
	    System.out.println("a=" + a + ", b=" + b + ", c=" + c);
	    
	    // 논리 연산의 단축 수행(Short Circuit)
	    // AND연산은 왼쪽 피연산자가 false라면 오른쪽항 연산은 수행 X
	    // OR연산은 왼쪽 피연산자가 true라면 오른쪽항 연산은 수행 X
	    
	    
	    
	}
}

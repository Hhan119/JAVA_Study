package test.main;

import test.mypac.AirPlane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		
		// return type이 void인 메소드 호출
		t.walk();
		
		// return type이 int인 메소드 호출하고 return되는 값을 a라는 int type 지역변수에 담기
		int a=t.getNumber();
		
		// return type이 String인 메소드 호출하고 return되는 값을 b라는 String type 지역변수에 담기
		String b=t.getGreeting();
		
		
		// return type이 AirPlane인 메소드 호출하고 return되는 값을 c라는 AirPlane type 지역변수에 담기
		AirPlane c = t.getPlane();
		c.fly();
		// c에 담긴 값을 이용해서 fly() 메소드를 호출
		

		// 위에서 생성한 객체의 setNum() 메소드를 호출
		t.setNum(999);
		t.setNum(a);
		// 위에서 생성한 객체의 setNaum() 메소드를 호출
		t.setName(b);
		// 위에서 생성한 객체의 setPlane() 메소드를 호출
		t.setPlane(new AirPlane());
		t.setPlane(c);

		t.doSomething(a, b, c);
		t.doSomething(999, "HI", new AirPlane());
		
		//오버로딩(다중 메소드)
		// 동일한 메소드명으로 여러개의 메소드가 정의 되어있음
		// - 메소드가 다중정의 되어있다.
		// - 메소드가 오버로딩(overloading) 되어있다.
		
		t.send();
		t.send(a);
		t.send(b);
		t.send(new AirPlane());
	
		}
	
}

package test.main;

import test.mypac.test;

public class MainClass07 {
	public static void main(String[] args) {
		// test 클래스로 객체를 생성하고, 참조값을 show1이라는 지역변수에 담기
		test show1 = new test();
		test show2 = new test();
		// 가로, 세로 값을 임의로 부여
		show1.width=5;
		show1.height=10;
		
		show2.width=10;
		show2.height=200;
		
		// 메소드 호출해서 테스트 
		show1.showArea();
		show2.showArea();
	}
}
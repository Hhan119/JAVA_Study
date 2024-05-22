package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		// 객체 생성 후 참조값을 Random type 지역변수 ran에 담기 
		//객체는 필드와 메소드로 이루어져 있음 
		Random ran = new Random();
		
		//정수 범위내에서 랜덤한 정수 하나 얻어내기
		int ranNum=ran.nextInt();
		System.out.println(ranNum);

		//0~9 사이의 랜덤한 정수얻어내기
		int ranNum2=ran.nextInt(10);
		System.out.println(ranNum2);
		
	}
}

//1. 클래스 import
//2. 객체를 생성
//3. 해당 객체의 메소드를 이용해서 랜덤한 정수 얻어내기
//4. 콘솔창에 출력할 수 있는 기능을 가진 printStream 객체를 이용해서 콘솔창에 출력 
package test.main;

import java.util.Random;

public class MainClass05 {
	public static void main(String[] args) {
		Random r1 = new Random();
		
		// -10 ~ 10 사이의 랜덤한 정수를 얻기보기
		int renNum1 = r1.nextInt(-10, 10);
		int renNum11 = r1.nextInt(10) -10;
		System.out.println(renNum1);
		System.out.println(renNum11);

		// 75 ~ 100 사이의 랜덤한 정수를 얻어보기
		int renNum2 = r1.nextInt(75, 100);
		System.out.println(renNum2);
		
		// 1 ~ 45 사이의 랜덤한 정수를 얻어보기
		int renNum3 = r1.nextInt(45)+1;		
		int renNum33 = r1.nextInt(1, 45);		
		System.out.println(renNum3);


	}
}

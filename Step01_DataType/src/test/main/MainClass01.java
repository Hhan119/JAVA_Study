package test.main;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

												// class의 이름이 MainClass01 (파일명과 동일하게 생성됨)
public class MainClass01 { 						// 클래스의 범위를 나타내는 괄호(시작)
	
												// app을 실행할 때(run 버튼 클릭시) 시작되는 main 메소드
	public static void main(String[] args) {	// 메소드의 범위를 나타내는 괄호(시작)
		// 정수형 변수 선언하고 값 대입하기 
		byte iByte=10;
		short iShort=500;
		int iInt=1000;
		long iLong=10000;
		
		int tmp = iShort;						// int type 변수에 short type 변수에 담긴 내용을 대입한다면.
												// - 표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에 대입 하는것은 문제가 없다
												// 따라서 에러를 발생시키지 않는다.
		
		byte tmp2 = (byte)iShort;				//표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면, 명시적으로 casting을 해야한다.

		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3;						// d, f를 붙이지 않은면 double type로 간주된다.
		
		double tmp3 = num1;						// float type에 있는 값을 double type에 담기
		float tmp4 =(float)num2;					// casting 연산자가 필요함

	} 											// main 메소드의 괄호(끝)
} 												// MainClass01 클래스의 괄호(끝)




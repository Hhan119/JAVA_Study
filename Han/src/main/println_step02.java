package main;

import java.util.Scanner;

public class println_step02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		String x = scan.next();
		System.out.println("입력한 결과:"+ x+ "??!");
		
		int y = scan.nextInt();
		System.out.println(y-543);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println((A+B)%C);
		System.out.println((A%C) + (B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C) * (B%C)%C);
	}

	
}

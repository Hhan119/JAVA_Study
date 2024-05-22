package main;

import java.util.Scanner;

public class Array_step02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("여기에 입력하세요");
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) min = arr[i];
			if(max<arr[i]) max = arr[i];
		}
		System.out.println(min + " "+max);
		
	}
	
}


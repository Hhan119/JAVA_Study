package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 0으로 초기화 된 방 3개짜리 int[] 객체를 생성해서 참조값을 지역변수 nums에 담기
		int[] nums = {0, 0, 0};
		
		// 0번방에 10, 1번방에 20, 2번방에 30을 저장
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0으로 초기화 된 방 500개짜리 int[] 객체를 생성해서 참조값을 지역변수 nums2에 담기
		int[] nums2 = new int[500];
		
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = (i+1) *500; 
			System.out.println(i+"번째 반복중..");
		}
	}
		
}

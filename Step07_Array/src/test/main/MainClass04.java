package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. String type을 담을 수 있는 방 3개짜리 빈 배열 객체를 생성해서 참조값을 지역변수 names에 담기
		//String[] names = {null, null, null};
		String[] names = new String[3];
		
		// 2. 3개의 방에 순서대로 친구의 이름을 담아 보세요.
		names[0]= "첼시";
		names[1]= "맨유";
		names[2]= "토트넘";
		
		// 3. 배열에 들어있는 친구의 이름을 for문을 이용해서 하나씩 순서대로 콘솔창에 출력 
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+"입니다.");
			
		}
	}
}

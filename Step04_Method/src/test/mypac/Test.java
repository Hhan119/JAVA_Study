package test.mypac;
/*
 * [메소드를 생성할 때 고려해야 하는 사항]
 * 1. 접근 지정자(default : public)
 * 2. static or non static(default : non static)
 * 3. return type(default : void)
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 type
 * 
 *  public => 페키지가 달라도 호출가능
 *  void => 이 메소드는 어떤 값도 리턴하지 않는다
 *  walk => 메소드명은 walk
 *  () => 이 메소드는 어떤값도 인자로 전달받지 않는 메소드 이다. (매개 변수가 선언되지 않고 비어 있음)
 */
public class Test {
	// public 자리의 접근 지정자는 public or default(작성x) or protected or private
	// 메소드를 호출한 곳으로 데이터를 반한할지 말자 반환한다면, 어떤 데이터 Type으로 반환할지 명시 해야 한다.
	public void walk() {
		System.out.println("걸어요!");
	}
	
	// int => 이 메소드를 호출한 그 위치로 int type 값을 반환 해주는 메소드
	public int getNumber() {
		int num=10;
		return num;		
	}
	
	// 인사말을 리턴하는 메소드르 작성
	public String getGreeting() {
		String great="즐거운 하루되세요";
		return great;
	}
	
	// 동일한 패키지 안에있는 AirPlane type을 return 해주는 메소드
	public AirPlane getPlane() {
		// AirPlane 객체를 생성해서 참조값을 air에 담는다.
		AirPlane air = new AirPlane();
		// 변수에 담긴 값을 return 해준다.
		return air;
	}
	
	// int type을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		
	}
	// String type을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		
	}
	// AirPlane type을 메소드의 인자로 전달 받는 메소드
	public void setPlane(AirPlane plane) {
		
	}
	// int type, String type, AirPlnae type 세개를 전달 받는 메소드
	public void doSomething(int num, String name, AirPlane plane) {
		
	}
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num+" 을 전송해요");
	}
	public void send(String name) {
		System.out.println(name+" 을 전송해요");
	}
	public void send(AirPlane Plane) {
		System.out.println("비행기가 날아요");
	}
	
	
}

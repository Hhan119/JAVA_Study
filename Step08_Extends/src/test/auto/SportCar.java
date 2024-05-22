package test.auto;

public class SportCar extends Car {

	public SportCar(Engine engine) {
		/*
		 *  super()는 부모 생성자(Car 클래스의 생성자)을 의미한다.
		 *  부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달 해야한다.
		 *  super() 코드 실행전에 다른 코드가 있으면 안된다. 
		 */
		super(engine); 
		// TODO Auto-generated constructor stub
	}
	
	public void openDrive() {
		
		//부모 객체의 필드도 this. 해서 참조 할 수 있다.
		if(this.engine==null) {
		System.out.println();
		return;
		}
		System.out.println("뚜겅을 열고 달려요!");
	}
	
}

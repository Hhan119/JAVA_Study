package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		// Weapon type의 참조값 얻어내기
		Weapon w1 = new Weapon() { // Weapon type의 참조값을 w1에 대입 
			
			@Override
			public void depender() {
			}
			
			@Override
			public void attack() {
				System.out.println("적을 공격하라!");
			}
		};

		useWeapon(w1);
		
		useWeapon(new Weapon() {

			@Override
			public void depender() {
				System.out.println("방어하라!");
			}
			@Override
			public void attack() {
				System.out.println("모두 공격하라!");
			}
			
		});
		
	
	}
	// MainClass06의 멤버 메소드 
	public static void useWeapon(Weapon w) {
		w.attack();
		w.prepare();
		w.depender();
	}
}
	

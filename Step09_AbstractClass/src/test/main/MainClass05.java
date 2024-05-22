package test.main;

import test.mypac.Weapon;

public class MainClass05 {
		
		static class SeaWeapon extends Weapon {
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("바다에 있는 적들을 공격하세요!");
			}

			@Override
			public void depender() {
				// TODO Auto-generated method stub
			}
		}	
		
		public static void main(String[] args) {	
			// 추상클래스 type의 참조값을 local inner class를 이용해서 얻어낸다.
			Weapon w1 = new SeaWeapon() ;
			w1.attack();
			w1.depender();
			
			// 메인 메소드 안에 클래스
			class SpaceWeapon extends Weapon{
				@Override
				public void attack() {
					// TODO Auto-generated method stub
					System.out.println("우주에 있는 적들을 공격하세요!");					
				}

				@Override
				public void depender() {
					// TODO Auto-generated method stub
					
				}
			}

		
			Weapon w2 = new SpaceWeapon();
			w2.prepare();
			w2.attack();
		}
	}


		

		
	



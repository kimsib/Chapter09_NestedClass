package Ch09_2_anonymous;

interface RemoteControl {
	void turnOn();
	void turnoff();

}

class AnonymousImpl {
	RemoteControl field = new RemoteControl () {
		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		} @Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}		
	}:
		
		
		 void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			
			
			
			
			
			
			
			
			
		};
	}

public class AninymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		
		
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl){
		
			@Override
			public void turnOn() {
			System.out.println("SmartTV를 켭니다.");
				
			}

			@Override
			public void turnoff() {
				System.out.println("SmartTV를 끕니다.");
				
			}
			
		});
		
		
		
		
		
		
		
		
	}
}

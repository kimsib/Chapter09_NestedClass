package Ch09_2_anonymous;

interface RemoteControl {
	void turnOn();
	void turnoff();

}

class AnonymousImpl {
	RemoteControl field = new RemoteControl () {
		@Override
		public void turnOn() {
			System.out.println("Tv�� �մϴ�.");
		} @Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}		
	}:
		
		
		 void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			
			
			
			
			
			
			
			
			
		};
	}

public class AninymousImplExample {
	public static void main(String[] args) {
		AnonymousImpl anony = new AnonymousImpl();
		
		
		
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl){
		
			@Override
			public void turnOn() {
			System.out.println("SmartTV�� �մϴ�.");
				
			}

			@Override
			public void turnoff() {
				System.out.println("SmartTV�� ���ϴ�.");
				
			}
			
		});
		
		
		
		
		
		
		
		
	}
}

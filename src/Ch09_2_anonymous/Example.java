package Ch09_2_anonymous;

class Animal {
	void sound() {
		System.out.println("~");
	}
}

//class Cat extends Animal {
//	@Override
//	void sound() {
//		System.out.println("�߿�");
//	}
//
//	void jump() {
//		System.out.println("���� �Ѵ´�.");
//	}
//
//	class Fish extends Animal {
//	@Override
//		void sound() {
//			System.out.println("����");
//		}
//
//		void swim() {
//			System.out.println("���ģ��.");
//		}
//	}

public class Example {
	public static void main(String[] args) {
	 	Animal ani = new Animal() {
	 	
	 		void run() { System.out.println("�Ĵٴ�~~");}
	 		@Override
	 		void sound() { System.out.println("�۸�");}
	 		run() {};
			
	 		
	
	 	ani.sound();
	 	
	 	ani = new Animal() {
	 		void swim() {
	 			System.out.println("����� Ĩ�ϴ�.");
	 		}
	 		@Override
	 		void sound() {
	 			System.out.println("O");
	 			swim();
	 		}
	 	};
	 	
	 	ani.sound();

}
	}
}

package Ch09_2_anonymous;

class Animal {
	void sound() {
		System.out.println("~");
	}
}

//class Cat extends Animal {
//	@Override
//	void sound() {
//		System.out.println("¾ß¿Ë");
//	}
//
//	void jump() {
//		System.out.println("´ãÀ» ³Ñ´Â´Ù.");
//	}
//
//	class Fish extends Animal {
//	@Override
//		void sound() {
//			System.out.println("»µ²û");
//		}
//
//		void swim() {
//			System.out.println("Çì¾öÄ£´Ù.");
//		}
//	}

public class Example {
	public static void main(String[] args) {
	 	Animal ani = new Animal() {
	 	
	 		void run() { System.out.println("ÈÄ´Ù´Ú~~");}
	 		@Override
	 		void sound() { System.out.println("¸Û¸Û");}
	 		run() {};
			
	 		
	
	 	ani.sound();
	 	
	 	ani = new Animal() {
	 		void swim() {
	 			System.out.println("Çì¾öÀ» Ä¨´Ï´Ù.");
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

package ch09_1_inner;
/** 바깥 클래스**/
public class A {
	
	A() { System.out.println("A 객체가 생성됨"); }

	
	/** 인스턴스 멤버 클래스 **/
	class B {
			// 필드
			int Field1;
			static int field2;
			// 생성자
			B() {
			System.out.println("B 객체가 생성됨");
			}		
			// 메소드
			void method1() {}
			static void method2() {}
	}
	
	/**정적 멤버 클래스**/
	static class c {
		int field1;
		static int field2;
		public c() {
			System.out.println("C 객체가 생성됨");
		}
		void method1 () {}
		static void method2() {}
				
		}
	//메소드 
	void method() {
		/**로컬 클래스**/
		class D {
			public D() {
				System.out.println("D 객체가  생성됨");
			}
			int field1;
			void method1 () {}
			
		}
		D d= new D();
		d.field1 = 3;
		d.method1();
	}
	
	
	
	}
	
	
	
	


package ch09_1_inner;
/** �ٱ� Ŭ����**/
public class A {
	
	A() { System.out.println("A ��ü�� ������"); }

	
	/** �ν��Ͻ� ��� Ŭ���� **/
	class B {
			// �ʵ�
			int Field1;
			static int field2;
			// ������
			B() {
			System.out.println("B ��ü�� ������");
			}		
			// �޼ҵ�
			void method1() {}
			static void method2() {}
	}
	
	/**���� ��� Ŭ����**/
	static class c {
		int field1;
		static int field2;
		public c() {
			System.out.println("C ��ü�� ������");
		}
		void method1 () {}
		static void method2() {}
				
		}
	//�޼ҵ� 
	void method() {
		/**���� Ŭ����**/
		class D {
			public D() {
				System.out.println("D ��ü��  ������");
			}
			int field1;
			void method1 () {}
			
		}
		D d= new D();
		d.field1 = 3;
		d.method1();
	}
	
	
	
	}
	
	
	
	


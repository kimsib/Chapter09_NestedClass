package ch09_1_inner;

public class AA {

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class BB {
		int bb;
		void method() {
			field1 = 10;
			method1();
			
			AA.field2 = 10;
			AA.method2();
			
		}
	}
				static class CC {
				public static int cc;
				void method () {
//����ƽ �ȵ�			field1 = 10;
//����ƽ �ȵ�			method1();
			
			AA.field2=10;
			AA.method2();
			
		}
	}
}

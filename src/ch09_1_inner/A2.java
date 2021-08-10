package ch09_1_inner;
/**클래스A2**/
public class A2 {
	
	/**인스턴스 멤버 클래스 B2**/
	class B2 {}
	
	/**스태틱 멤버 클래스 C2**/
	static class C2 {}

	// 인스턴트 필드
	B2 Field1 = new B2();
	C2 field2 = new C2();
	

	// 스태틱 필드
//	static B2 field3 = new B2();
	static C2 field4 = new C2();
	
	// 인스턴스 메소드
	void meThod1 () {
		B2 var1 = new B2();
		C2 var2 = new C2();	
	}
	
	// 스태틱 메소드
	static void method2() {
//	B2 var1 = new B2();
	C2 var2 = new C2();
	}

}

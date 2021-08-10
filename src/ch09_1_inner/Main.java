package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
	
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b	= new B();
		b.Field1 = 3;
		b.method1();
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.class.field = 3;
		A.class.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
}
}

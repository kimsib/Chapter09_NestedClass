package ch09_1_inner;

public class Main {
	public static void main(String[] args) {
	
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b	= new B();
		b.Field1 = 3;
		b.method1();
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.class.field = 3;
		A.class.method2();
		
		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
}
}

package Ch09_2_anonymous;

class Person {
	void wake() {System.out.println("7�ÿ� �Ͼ�ϴ�.");}
}


class Anonymous {
	Person field = new Person() {
		void work() {System.out.println("����� �մϴ�.");}
		
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	void method1() {
		Person localVar=new Person() {
			void walk() { System.out.println("��å�� �մϴ�.");}
			
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
				
			}
		};
		localVar.wake();
	}
			
		void method2(Person person) {
			person.wake();
}
}

public class AnonymousExample {
	public static void main(String[] args) {
			Anonymous anony =new Anonymous();
			
			// �͸� ��ü �ʵ� ���
			anony.field.wake();
			
			// �͸� ��ü ���� ���� ���			
			anony.method1();
			
			// �͸� ��ü �Ű��� ���
			anony.method2(new Person() {
				void study() { System.out.println("���θ� �մϴ�.");}
				
				void wake () {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			});
	}
}	
	
			
			
			
			
			
			
	
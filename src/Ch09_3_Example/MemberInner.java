package Ch09_3_Example;

class Outer {
	int num = 0;

	class Member {
		//
		void add(int n) {
			num += n;
		}

		int getNum() {
			return num;
		}
	}
}

public class MemberInner {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer o2 = new Outer();

		// o1 ������� �� �ν��Ͻ��� ����
		Outer.Member o1m1 = o1.new Member();
		Outer.Member o1m2 = o1.new Member();

		// o2 ������� �� �ν��Ͻ��� ����
		Outer.Member o2m1 = o2.new Member();
		Outer.Member o2m2 = o2.new Member();

		// o1 ������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ��
		o1m1.add(5);
		System.out.println(o1m1.getNum());

		// o2 ������� ������ �� �ν��Ͻ��� �޼ҵ� ȣ��
		o2m1.add(7);
		System.out.println(o2m2.getNum());
	}

}

package Ch09_2_anonymous;
interface Calculatable {
	int sum();
	
}
class Anonymous {
	private int field;
	public void method ( final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		field = 10;
//		arg1 = 20;
		arg2 = 20;
//		var1 = 30;
		var2 = 30;
		
		
		Calculatable calc = new Calculatable() {
			
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
					return	result;
			}
		};
		System.out.println(calc.sum());
	}
}



public class AnonymousExample2 {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
}

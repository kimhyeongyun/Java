package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(); // A 부터 먼저 만들기
		A.B b = a.new B();
		b.field = 1;
		b.method();
		
		A.C c = new A.C();
		c.field = 1;
		c.method();
	}

}

package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(); // A ���� ���� �����
		A.B b = a.new B();
		b.field = 1;
		b.method();
		
		C c =new C();
		c.field = 1;
		c.method();
	}

}

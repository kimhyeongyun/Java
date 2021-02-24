package ch09.exam01;

public class A {
	// field
	
	// 생성자
	
	// 메서드
	public void method() {
		// 로컬 클래스
		class F { /* static int field2; : 위배가 된다. */ }
		// interface G {} 인터페이스는 불가능..
		}
	
	// Nested class(or interface)
	// 멤버 클래스(인터페이스)
	public class B {}
	public static class C {}
	public interface D {}
	public static interface E {}
		
}
	// A.B b = a.new B();
	// b.field1 = 3;
	// b.method1();
	


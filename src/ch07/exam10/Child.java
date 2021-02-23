package ch07.exam10;

public class Child extends Parent {
	
	public int field2;
	//메서드
	@Override
	public void method2 () {
		System.out.println("Child: method2() 호출");
	}
	
	public void method3 () {
		System.out.println("Child: method3() 호출");
	}
	
}

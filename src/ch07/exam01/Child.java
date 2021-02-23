package ch07.exam01;

public class Child extends Parent {
	//필드
	public int field2;
	//생성자
	public Child() {
		// super(); 
		System.out.println("Child 객체 생성");
	}
	//메서드
	public void method2 () {
		System.out.println("method2() 실행");
	}
}

package ch07.exam02;

public class Child extends Parent {
	//필드
//	public int field2;
	//생성자
	public Child(String firstName) {
		super("김", firstName); // 부모의 생성자를 정확하게 입력, 반드시 첫줄에서 입력해여
		System.out.println("Child 객체 생성");
	}
	//메서드
	public void method2 () {
		System.out.println("method2() 실행");
	}
}

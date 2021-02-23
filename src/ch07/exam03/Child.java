package ch07.exam03;

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
	
	@Override // 재정의 : 가급적 붙여주기
	public void sound() { // 부모의 접근제한자보다 넓게는 가능하나 
		// 좁게는 불가능.
		System.out.println("싫어요~~~~");
	}
}

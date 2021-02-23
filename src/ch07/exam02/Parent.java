package ch07.exam02;

public class Parent {
	//필드
	public String lastName;
	public String firstName;
	
	//생성자
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 객체 생성");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	//메서드
	public void method1 () {
		System.out.println("method1() 실행");
	}
}

package ch07.exam03;


public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child("길동");
		Parent parent = new Parent("asd", "Asd");
		//참조 변수 선언
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.sound();
		parent.sound();
	}
}

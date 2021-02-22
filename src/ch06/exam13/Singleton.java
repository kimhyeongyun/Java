package ch06.exam13;

public class Singleton {
	// 필드
	private static Singleton singleton = new Singleton();
	
	// 생성자 : 클래스 이름이랑 똑같고 리턴이 없는 것이 생성자임
	private Singleton() { // private를 이용하면 new를 가지고 객체생성 못함.
	}
	// 메서드
	static Singleton getInstance() {
		return singleton;
	}
	
	
	
	
}

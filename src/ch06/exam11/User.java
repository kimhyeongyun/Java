package ch06.exam11;

public class User {
	// 구성요소 3개 : 필드 생성자 메서드
	// 필드 : 객체마다 하나씩 가지고 있어야 하는 속성들. 
	String id;
	String name;
	String password;
	static String nation = "한국"; // 객체를 만들지 않아도 사용할 수 있는
	// instance 필드를 선언한다고 얘기. 앞으로 User 객체안에 들어갈 놈들
	
	// 생성자는 instance 멤버가 될 수 없음.
	User(String name) {
		this.name = name;
	}
	
	// Method : 공유라 하면 다 메서드 : 정적필드(값이 고정적인 것 : static field)
	// instance field는 객체 안에 저장됨.
	// 메서드도 객체가 있어야 쓸 수 있는 / 없어도 쓸 수 있는 메서드가 있음.
	
	void login() {
		System.out.println(name + "님이 로그인합니다.");
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
	
	static void info() { // 객체가 없어도 사용할 수 있음.
		nation = "대한민국";
		System.out.println("모든 USER는 한국인입니다.");
		System.out.println();
	} 
	
}

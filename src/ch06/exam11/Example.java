package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		// 인스턴드 멤버(필드, 메서드)는 반드시
		// 객체 참조 변수(user)를 통해서 접근을 해야.
		User user = new User("홍길동");
		
	
		
		System.out.println(user.name);
		user.login(); // 객체있어야 쓸 수 있음.
		user.logout();
		
		// 인스턴스 멤버를 강조하는 이유:
		
		// 정적 멤버(필드, 메서드)는 객체가 없어도 사용가능
		System.out.println("User.nation");
		User.info();
		
	}

}

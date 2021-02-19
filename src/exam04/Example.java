package exam04;

public class Example {

	public static void main(String[] args) {
		
		
		
		Korean k1 = new Korean("홍길동", "111111-1111111");
		// Korean k1 = new Korean(); : 이렇게 하면 ERROR가 생김.
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("감자바", "222222-1111111");
		// Korean k1 = new Korean(); : 이렇게 하면 ERROR가 생김.
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}

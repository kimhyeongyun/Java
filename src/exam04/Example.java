package exam04;

public class Example {

	public static void main(String[] args) {
		
		
		
		Korean k1 = new Korean("ȫ�浿", "111111-1111111");
		// Korean k1 = new Korean(); : �̷��� �ϸ� ERROR�� ����.
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "222222-1111111");
		// Korean k1 = new Korean(); : �̷��� �ϸ� ERROR�� ����.
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}

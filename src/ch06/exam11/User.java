package ch06.exam11;

public class User {
	// ������� 3�� : �ʵ� ������ �޼���
	// �ʵ� : ��ü���� �ϳ��� ������ �־�� �ϴ� �Ӽ���. 
	String id;
	String name;
	String password;
	static String nation = "�ѱ�"; // ��ü�� ������ �ʾƵ� ����� �� �ִ�
	// instance �ʵ带 �����Ѵٰ� ���. ������ User ��ü�ȿ� �� ���
	
	// �����ڴ� instance ����� �� �� ����.
	User(String name) {
		this.name = name;
	}
	
	// Method : ������ �ϸ� �� �޼��� : �����ʵ�(���� �������� �� : static field)
	// instance field�� ��ü �ȿ� �����.
	// �޼��嵵 ��ü�� �־�� �� �� �ִ� / ��� �� �� �ִ� �޼��尡 ����.
	
	void login() {
		System.out.println(name + "���� �α����մϴ�.");
	}
	
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
	
	static void info() { // ��ü�� ��� ����� �� ����.
		nation = "���ѹα�";
		System.out.println("��� USER�� �ѱ����Դϴ�.");
		System.out.println();
	} 
	
}

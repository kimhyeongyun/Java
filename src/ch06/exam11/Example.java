package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		// �ν��ϵ� ���(�ʵ�, �޼���)�� �ݵ��
		// ��ü ���� ����(user)�� ���ؼ� ������ �ؾ�.
		User user = new User("ȫ�浿");
		
	
		
		System.out.println(user.name);
		user.login(); // ��ü�־�� �� �� ����.
		user.logout();
		
		// �ν��Ͻ� ����� �����ϴ� ����:
		
		// ���� ���(�ʵ�, �޼���)�� ��ü�� ��� ��밡��
		System.out.println("User.nation");
		User.info();
		
	}

}

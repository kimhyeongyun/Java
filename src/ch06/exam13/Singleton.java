package ch06.exam13;

public class Singleton {
	// �ʵ�
	private static Singleton singleton = new Singleton();
	
	// ������ : Ŭ���� �̸��̶� �Ȱ��� ������ ���� ���� ��������
	private Singleton() { // private�� �̿��ϸ� new�� ������ ��ü���� ����.
	}
	// �޼���
	static Singleton getInstance() {
		return singleton;
	}
	
	
	
	
}

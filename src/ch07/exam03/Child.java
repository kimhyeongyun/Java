package ch07.exam03;

public class Child extends Parent {
	//�ʵ�
//	public int field2;
	//������
	public Child(String firstName) {
		super("��", firstName); // �θ��� �����ڸ� ��Ȯ�ϰ� �Է�, �ݵ�� ù�ٿ��� �Է��ؿ�
		System.out.println("Child ��ü ����");
	}
	//�޼���
	public void method2 () {
		System.out.println("method2() ����");
	}
	
	@Override // ������ : ������ �ٿ��ֱ�
	public void sound() { // �θ��� ���������ں��� �аԴ� �����ϳ� 
		// ���Դ� �Ұ���.
		System.out.println("�Ⱦ��~~~~");
	}
}

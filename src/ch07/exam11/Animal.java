package ch07.exam11;

public abstract class Animal {
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	public void eat() {
		System.out.println("�Խ��ϴ�.");
	}
	
	// abstract class �ȿ��� �̿Ͱ��� �޼��带 ���� �� ����.
	public abstract void sound();
	
}

package ch07.exam02;

public class Parent {
	//�ʵ�
	public String lastName;
	public String firstName;
	
	//������
	public Parent(String lastName, String firstName) {
		System.out.println("Parent ��ü ����");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	//�޼���
	public void method1 () {
		System.out.println("method1() ����");
	}
}

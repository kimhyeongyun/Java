package ch07.exam03;

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
	public void sound () {
		System.out.println("�����ض�~~~~");
	}
}

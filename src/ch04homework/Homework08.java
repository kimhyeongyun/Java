package ch04homework;

public class Homework08 {

	public static void main(String[] args) {
		char grade= 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}
}

package ch04homework;

public class Homework19 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}

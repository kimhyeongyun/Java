package ch04homework;

public class Exercise01 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��: " + sum);
	}
}

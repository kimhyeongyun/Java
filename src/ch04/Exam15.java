package ch04;

import java.util.Scanner;

public class Exam15 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			//Ű���忡�� �Է��� ������ data ������ ����
			System.out.print("�Է� : "); // ln�� �Ⱥٿ����Ƿ� �ٷ� �ڿ��� �Է��� �� �� ����.
			String data = scanner.nextLine(); // nextLine : ���͸� �ϱ� ���� ��� ������ �Է¹���
			
			//data ������ ���� ���
			System.out.println("��� : " + data);
			
			if(data.equals("���ɽð�")) { // ���ڿ��� ���� ���� equals�� �̿�, ���߿� �ٽ� �˷��� ��
				break;
			}
		}
	}
}

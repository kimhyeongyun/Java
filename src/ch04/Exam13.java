package ch04;

import java.util.Scanner;

public class Exam13 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		//Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);
		
		//Ű���忡�� �Է��� ������ data ������ ����
		System.out.print("�Է� : "); //ln�� �Ⱥٿ����Ƿ� �ٷ� �ڿ��� �Է��� �� �� ����.
		String data = scanner.nextLine(); // nextLine : ���͸� �ϱ� ���� ��� ������ �Է¹���
		
		//data ������ ���� ���
		System.out.println("��� : " + data);
		
	
	}
}

package ch04homework;

import java.util.Scanner;

public class Homework18 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			
			//Ű���忡�� �Է��� ������ data ������ ����
			System.out.print(">"); // ln�� �Ⱥٿ����Ƿ� �ٷ� �ڿ��� �Է��� �� �� ����.
			inputString = scanner.nextLine(); // nextLine : ���͸� �ϱ� ���� ��� ������ �Է¹���
			System.out.println(inputString);
			
		} while(!inputString.equals("q"));
		
			System.out.println();	
			System.out.println("���α׷� ����");
		}
}

package ch04homework;

import java.util.Scanner;

public class Exercise05 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
			
			int num1 = Integer.parseInt(scanner.nextLine());
				
			if(num1 == 1){
				System.out.print("���ݾ�>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 2){
				System.out.print("��ݾ�>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 3){
				System.out.print("�ܰ�>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 4) {
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	}
}
	


package ch04;

public class Exam12 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		
		
		int count = 0;
		
		while(true) {
			count++;
			
			if(count % 2 == 0) {
				continue;
			}
			
			System.out.println(count);
			
			if(count >= 10) {
				break; // method�� ����ǹǷ� �Ʒ��� �ִ� �͵��� ������ �ȵ�	
			}
		}
		
		System.out.println("���α׷� ������ ���� ����");
		
	}
}

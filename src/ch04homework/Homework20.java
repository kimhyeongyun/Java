package ch04homework;

public class Homework20 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z' ; lower++) {
				
				System.out.println(upper + "-" + lower);
				
				if(lower == 'g') {
					break Outter;
			
				}
			}
		}
		System.out.println("���α׷� ����");
	}
}

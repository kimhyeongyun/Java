package ch04homework;

public class Exercise02 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
	
		
		// double Ÿ���� ���� temp �����ϴ�. temp ������ 0���� 1������ ������ �Ǽ��� �����Ѵ�.
		
		while(true) {
			
			double temp1 = Math.random();
			double temp2 = Math.random();
			int temp3 = (int) (temp1 * 6)+ 1;
			int temp4 = (int) (temp2 * 6)+ 1;
			int total = temp3 + temp4;
			  
	
			System.out.println("(" + temp3 + ", " + temp4 + ")");
			
			if(total == 5) {
				break;
			}
		}
	}
}

package ch04homework;

public class Exercise03 { // Exam06 : Ŭ���� �̸��̶�� ��.

	public static void main(String[] args) { // ���� �޼���
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
	
		
		// double Ÿ���� ���� temp �����ϴ�. temp ������ 0���� 1������ ������ �Ǽ��� �����Ѵ�.
		
		double temp1 = Math.random();
		double temp2 = Math.random();
		int temp3 = (int) (temp1 * 6)+ 1;
		int temp4 = (int) (temp2 * 6)+ 1;
		int total = temp3 + temp4;
		 
		
		for(int i = 0; i <= 10; i += 1) {
			
			for(int j = 0; j <= 10; j += 1) {
				
				if(4*i + 5*j == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}

			}
		}
	}
}

package ch05;

public class Exam07 {

	public static void main(String[] args) { // main method�� �θ�
		
		int[] scores = {90, 85, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����: " + sum);
		
		double avg = (double) sum / scores.length; // �ſ� �߿�!!!!!! ���� ������ ������ ������ �����Ƿ� �ϳ��� double�� �ٲ����.
		System.out.println("���: " + avg);
		
	}
	
}

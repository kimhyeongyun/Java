package ch05homework;

public class Exam05 {

	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����: " + sum);
		
		double avg = (double) sum / scores.length; // �ſ� �߿�!!!!!! ���� ������ ������ ������ �����Ƿ� �ϳ��� double�� �ٲ����.
		System.out.println("���: " + avg);
	}
}
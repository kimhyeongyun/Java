package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// �ֻ����� ���� ������ �� ���(1, 2, 3, 4, 5, 6)
		// int value = ?;

		double temp = Math.random();
		// double Ÿ���� ���� temp �����ϴ�. temp ������ 0���� 1������ ������ �Ǽ��� �����Ѵ�.
		
		
		System.out.println(temp); // ���� = [0, 1) �Ǽ� : 0�� �����ϰ� 1�� �������� ����
		// random() : �����δ� () <-�̰��� method ȣ��� �θ� ��, method �̸��� random�̰� �̰��� �����ϰڴ�.
		System.out.println(temp * 6); // [0, 6) �Ǽ�
		System.out.println( (int) (temp * 6) ); // 0, 1, 2, 3, 4, 5 
		System.out.println( (int) (temp * 6) + 1); // 1, 2, 3, 4, 5, 6
		
		int value = (int) (temp * 6) + 1;
		
		System.out.println("value : " + value);
		
		if (value % 2 == 0) { // ������ ����
			System.out.println("¦���� ���Ծ��.");
		} else {
			System.out.println("Ȧ���� ���Ծ��.");
		}
		
		
	}
}

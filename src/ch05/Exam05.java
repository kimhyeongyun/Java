package ch05;

public class Exam05 {

	public static void main(String[] args) { // main method�� �θ�
		
		// �迭�� ����
		int[] arr1 = new int[3]; // intŸ�� �迭 ���� arr1 �����Ѵ�. / ���� ��ü�� �����. int���� 3���� �� �� �ִ� �迭�� �����.
		
		// �迭 �׸��� ���� �а� ���
		for(int i=0; i < arr1.length; i++) { // .�� �ǹ�: ~�� ���� �� �ǹ��Ѵ�. arr1�� �����ϴ� 00������ ���� ���̸� �����϶�.
			System.out.println(arr1[i]); // for���� �� 3�� �ݺ�
			
		}
		
		// �迭 �׸��� ���� ����
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		// �迭 �׸��� ���� �а� ���
		for(int i=0; i < arr1.length; i++) { // .�� �ǹ�: ~�� ���� �� �ǹ��Ѵ�. arr1�� �����ϴ� 00������ ���� ���̸� �����϶�.
					System.out.println(arr1[i]); // for���� �� 3�� �ݺ�
					
		}
		
		//�迭 �׸� ��
		System.out.println(arr1[0] == 90);
		System.out.println(arr1[1] != 80);
	}
	
}

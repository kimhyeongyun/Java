package ch05;

public class Exam06 {

	public static void main(String[] args) { // main method�� �θ�
		
		// �迭�� ����
		String[] arr1 = new String[3]; // intŸ�� �迭 ���� arr1 �����Ѵ�. / ���� ��ü�� �����. int���� 3���� �� �� �ִ� �迭�� �����.
		
		// �迭 �׸��� ���� �а� ���
		for(int i=0; i < arr1.length; i++) { // .�� �ǹ�: ~�� ���� �� �ǹ��Ѵ�. arr1�� �����ϴ� 00������ ���� ���̸� �����϶�.
			System.out.println(arr1[i]); // for���� �� 3�� �ݺ�
			
		}
		
		// �迭 �׸��� ���� ����
		arr1[0] = "ȫ�浿";
		arr1[1] = "ȫ�ڹ�";
		arr1[2] = "ȫ����";
		
		// �迭 �׸��� ���� �а� ���
		for(int i=0; i < arr1.length; i++) { // .�� �ǹ�: ~�� ���� �� �ǹ��Ѵ�. arr1�� �����ϴ� 00������ ���� ���̸� �����϶�.
					System.out.println(arr1[i]); // for���� �� 3�� �ݺ�
					
		}
		
		//�迭 �׸� ��
		System.out.println(arr1[0].equals("ȫ�浿"));
		System.out.println(!arr1[1].equals("ȫ�ڹ�"));
		
	}
	
}

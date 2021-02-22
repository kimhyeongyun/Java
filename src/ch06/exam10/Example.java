package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer = new Changer(); // ��ü ����
		
		//Call by Value("��"�� "����"�ؼ� ȣ���Ѵٴ� �ǹ�)
		int v1 = 1; // Changer�� value�ʹ� �ٸ� ����.
		changer.change(v1);
		System.out.println(v1); // 2�� ��µǾ�������� 1�� ��µ�.
		
		//Call by Reference("����"�� "����"�ؼ� ȣ���Ѵٴ� �ǹ�)
		String v3 = "A"; // �����ϰ� ���� ���� �� �ƴ϶� A��� ������ ����
		// ����Ÿ�Դϱ� A��� �ϴ� ���ڿ� ��ü�� ������ ����
		changer.change(v3);
		System.out.println(v3); // ���� A�� ����.
		// Call by Reference�߿��� String�� ����...
		
		//Call by Reference("����"�� "����"�ؼ� ȣ���Ѵٴ� �ǹ�)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1); // ������ ������ ��. ���� �ƴ϶�
		// �迭�� ��ü��. heap�� ���������. ������ 5������ ����
		// arr1 : 5���� - > 0,0,0
		// arr2 : 
		System.out.println(arr1[0]); // 2�� ����...��..?
		// ������ ����Ǿ��� ������ ���� �迭�� ������
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3); // ������ ������ ��.
		System.out.println(arr3[0]);
		
		Member m1 = new Member(); // ��ü ����. ���� ����
		// ��� ��ü �ȿ� age : 1��� �ʵ尡 �������.
		System.out.println(m1.age);
		changer.change(m1);
		System.out.println(m1.age);
	}	
	

}

package ch06.exam10;

public class Changer {

	// �ʵ� ������ �޼��� �� ��������, �޼��� ���ַ� ���� ��
	void change(int v2) { // �⺻Ÿ��
		v2 = 2;
	}
					// V3	
	void change(String v4) { // ����Ÿ��
		v4 = "B"; // B��� �ϴ� ���� V4�� �����ߴ�.
		// 
	}
				// ���� 5 ����
	void change(int [] arr2) { // ����Ÿ��
		arr2[0] = 2;  // ������ ����Ǿ��� ������ ���� �迭�� ������
	}
	
						// ���� 7 ����
	void change(String [] arr4) { // ����Ÿ��
		arr4[0] = "B";
	}
	
	void change(Member m2) {
		m2.age = 2; // m2�� �����ϴ� ��ü�� ���� 
	}
	
	
}

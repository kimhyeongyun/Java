package ch06.exam09;

public class Calculator {
	// �ʵ�, ������, �޼���
	
	// �⺻ �����ڴ� �⺻������ �������
	Calculator() {
		
	}
	
	double area(int w) {
		return w * w;
	}
	
	
	// ���簢�� ����
	double area(double w) { // ���� ��(int w)�� ������ 10�� ������ double w�� ������ �� �� ����. �ڵ�Ÿ�Ժ�ȯ�� �� �� �ִ� Ÿ���� ã��
		return w * w;
	}
	
	// ���簢�� ����
	double area(double w, double h) {
		return w * h;
	}
	
	// ���� ����
//	double area(double r) {  // �̰� �ȵ� (int r)�� ����
//		return				 // �̰� �ȵ�
//	} 						 // �̰� �ȵ�
	
	// ���� ����
	double areaCircle(double r) {
		return r * r * Math.PI;
		
	}
	
	
}

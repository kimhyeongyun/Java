package ch06homework.exam13;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalcu = new Calculator();
		
		// ���簢�� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		// ���ð����� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// ��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	}

}
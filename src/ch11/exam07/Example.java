package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		
		Integer var2 = new Integer(10); // var2 : ��������
		Integer var3 = 10; // �� �Ǵ°���...? �� �߰��� �Ӱ� �ֳĸ� 10�� integer�� ��ü�� ���� ����ִ� �� �� �̴ϴ�.
		// Auto-Boxing
		
		double var4 = 3.5;
		Double var5 = new Double(3.5); // ���ʹ� ������ �ٸ� ��. 
		Double var6 = 3.5; // ���� ��� ����������...? ����ڽ�
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue();
		int var9 = var7; // Auto UnBoxing
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12 = var10; // ������ ��� �� �� �ֽ��ϱ�. Wrapper ���� Ŭ���� 8���� �׷�.
		
		Object[] arr = new Object[5]; // Object�� �ڽİ�ü � ���̵� �� �� ����.
		arr[0] = "abc"; // �����Ѵ�.
		arr[1] = 10; // 10�� ��ü�� �ƴϰ� ���ε� �� �Ǵ°Ϲ�..? �������� �ȵǾ��� �ڹ�5 �������� / �׳� ���� �� �ƴϰ� 
		// new Integer(10)�̷� ������ ��������� �� ������ ���� ��. Auto Boxing
		arr[2] = true; // true�� ��ü�� �ƴѵ� �ȰϹ�. Auto Boxing 
		
		
	}

}

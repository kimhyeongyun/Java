package ch02;

public class Exam01 {

	public static void main(String[] args) {
		
		// ���� Ÿ���� ���� ����� �� ����
		byte var1 = -128; //-128~127
		short var2 = 32767;
		int var3 = 2147483647; // �ڹٿ��� ������ ����� �� �ַ� int�� ���
		long var4 = 20000000000000L;
		
		// ���� Ÿ���� ���� ����� �� ����
		char var9 = 65; // char�� ��� ������ ������ �� ����
		char var10 = 'A'; // '' �ȿ��� ���ڰ� �� �ϳ� �;���
		
		// �Ǽ� Ÿ���� ���� ����� �� ����
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789; // ����Ÿ���� ���� var6�� 2.5�� �����Ѵ�.
		// double �� ���е��� �� ����. �ڹٿ����� �����ؼ� �Ҽ��� �� �� double�� ���
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		
		// �� Ÿ���� ���� ����� �� ����
		boolean var7 = true;
		boolean var8 = false;
		
		// int var9; // ��ƮŸ���� ���� var9�� �����Ѵ�.
		var9 = 2; // var9�� 2�� �����Ѵ�.
	}

}

package ch11.exam05;

import java.util.Arrays;


public class String01 {

	public static void main(String[] args) throws Exception { // �̷��� ���� ������? JVM / a.java -> (javac) a.class -> (java) JVM�� �����Ŵ
		// TODO Auto-generated method stub
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		
		String str2 = new String("ABC");
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); // Arrays.toString() ����ϱ�
		
		
		String str3 = "������";
		byte[] arr31 = str3.getBytes("EUC-KR"); // ����� �ѱ۸� ���� / �ѱ����ڴ� 2byte�� ǥ�� -80, -95 -> �� 
		byte[] arr32 = str3.getBytes("UTF-8"); // �����質�� ��� �� ���� / ��κ� ���ͳݿ��� �ְ� �޴� ��� / �ѱ����ڴ� 3byte�� ǥ��  -22, -80, -128 -> ��
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32)); 
		
		// �ٽ� �ѱ۷� ����
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);	
		
	}

}

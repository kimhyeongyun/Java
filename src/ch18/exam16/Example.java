package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		

		
		// �� �κе��� ��� �ݺ��ؾ���.
//		InputStream is = System.in;
//		byte[] data = new byte[100];
//		
//		int readNum = is.read(data);
//		String str = new String(data, 0, readNum -2);
//		System.out.println(str);
		
		// ���2 : ������Ʈ�� ���
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); // ����Ʈ�� ���ڷ� �ٲ��ִ� ������Ʈ��
		BufferedReader br = new BufferedReader(isr); // ���� �� ������Ʈ���� ���� ��
		
		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine(); // �ѹ� �� �а� ������
		System.out.println(str);
		
	}

}

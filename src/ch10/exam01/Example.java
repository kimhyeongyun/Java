package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���ܴ� 2������ ����.
		
		int[] arr = null;
		arr[0]  = 10; // NullPointerException => ���� ����(�����Ϸ��� üũ���� ����)
		
		              // FileNotFoundExcemption => �Ϲ� ����(������ üũ ����)
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt");
		
	}

}

package ch11.exam08;

import java.util.Calendar;

public class Example2 {


		
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // new Calendar();�� �����ϴ� ���� : �����ڰ� protected ; �ܺο��� ��ü ���� ���� 
		// ���� �޼��� getInstance�� ����ؼ� �̱��� ����� 
		// ��? ��ǻ���� ��¥�� �ϳ��̹Ƿ�
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0~11 �̹Ƿ� + 1 ����� ��.
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		

	}
}

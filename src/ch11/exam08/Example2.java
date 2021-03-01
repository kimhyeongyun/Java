package ch11.exam08;

import java.util.Calendar;

public class Example2 {


		
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // new Calendar();를 사용안하는 이유 : 생성자가 protected ; 외부에서 객체 생성 못함 
		// 정적 메서드 getInstance를 사용해서 싱글톤 방식의 
		// 왜? 컴퓨터의 날짜는 하나이므로
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0~11 이므로 + 1 해줘야 함.
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		

	}
}

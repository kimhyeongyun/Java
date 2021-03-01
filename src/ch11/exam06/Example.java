package ch11.exam06;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		// 전화번호 체크
		String regExp = "010-\\d{3,4}-\\d{4}";
		String data = "010-23-1234";
		boolean result = Pattern.matches(regExp, data); // 정적 메소드 matches 사용
		if(result) {
			System.out.println("유효한 데이터");
		} else {
			System.out.println("잘못된 데이터");
		}
		
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*"; // 인터넷 출처, \\ 두개 넣는거 기억하기
		String password = "123456789@aA";
		boolean result2 = Pattern.matches(regExp2, password); // 정적 메소드 matches 사용
		if(result2) {
			System.out.println("유효한 패스워드");
		} else {
			System.out.println("잘못된 패스워드");
		}
	}

}

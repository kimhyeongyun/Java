package ch06.exam14;

public class Korean {
	// 필드
	final static String NATION = "한국"; // final static인 경우 필드명을 대문자로 하는 게 관례
	final String ssn; // 값을 줘야 에러가 안생김
	// 생성자
	Korean(String ssn) {
		this.ssn = ssn; // 딱 한번만 허용
	}
	// 메서드
}

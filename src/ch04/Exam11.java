package ch04;

public class Exam11 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		
		
		int count = 0;
		
		while(true) {
			count++;
			System.out.println(count);
			if(count >= 10) {
				return ; // method가 종료되므로 아래에 있는 것들은 실행이 안됨
				
			}
		}
		
		// System.out.println("프로그램 마무리 내용 실행");
		
	}
}

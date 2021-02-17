package ch04homework;

public class Homework20 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z' ; lower++) {
				
				System.out.println(upper + "-" + lower);
				
				if(lower == 'g') {
					break Outter;
			
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}

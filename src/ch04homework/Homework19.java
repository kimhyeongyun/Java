package ch04homework;

public class Homework19 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}

package ch04homework;

public class Exercise01 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}

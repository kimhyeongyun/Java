package ch04;

public class Exam08 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		
		int sum = 0;
		int i;
		
		for (i=1; i <= 100; i++) {
			int value = i;
			sum += value;
		}
		
		System.out.println("1~" + i + ": " + sum);
		
	}
}

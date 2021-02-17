package ch04;

public class Exam09 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		
		boolean stop = false;
		int count = 0;
		
		while(!stop) {
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}
		}
		
		System.out.println();
		//---------------------------------------
		
		count = 0;
		while(count <= 10) {
			System.out.println("Hello");
			count++;
		}
		
	}
}

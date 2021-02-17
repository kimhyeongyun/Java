package ch04;

public class Exam10 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		
		boolean stop = false;
		int count = 0;
		
		do {
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}
		} while(!stop); // 무조건 한번은 실행을 함
		
		System.out.println();
		//---------------------------------------
		
		count = 0;
		do{
			System.out.println("Hello");
			count++;
		} while(count <= 10); 
		
	}
}

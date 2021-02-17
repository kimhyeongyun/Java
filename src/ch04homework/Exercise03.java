package ch04homework;

public class Exercise03 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
	
		
		// double 타입의 변수 temp 선언하다. temp 변수에 0에서 1사이의 무작위 실수를 저장한다.
		
		double temp1 = Math.random();
		double temp2 = Math.random();
		int temp3 = (int) (temp1 * 6)+ 1;
		int temp4 = (int) (temp2 * 6)+ 1;
		int total = temp3 + temp4;
		 
		
		for(int i = 0; i <= 10; i += 1) {
			
			for(int j = 0; j <= 10; j += 1) {
				
				if(4*i + 5*j == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}

			}
		}
	}
}

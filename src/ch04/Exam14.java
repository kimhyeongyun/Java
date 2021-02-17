package ch04;

import java.util.Scanner;

public class Exam14 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			//키보드에서 입력한 내용을 data 변수에 저장
			System.out.print("입력 : "); //ln을 안붙였으므로 바로 뒤에다 입력을 할 수 있음.
			String data = scanner.nextLine(); // nextLine : 엔터를 하기 전의 모든 값들을 입력받음
			
			//data 변수의 값을 출력
			System.out.println("출력 : " + data);
		}
	}
}

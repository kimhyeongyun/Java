package ch04homework;

import java.util.Scanner;

public class Homework18 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			
			//키보드에서 입력한 내용을 data 변수에 저장
			System.out.print(">"); // ln을 안붙였으므로 바로 뒤에다 입력을 할 수 있음.
			inputString = scanner.nextLine(); // nextLine : 엔터를 하기 전의 모든 값들을 입력받음
			System.out.println(inputString);
			
		} while(!inputString.equals("q"));
		
			System.out.println();	
			System.out.println("프로그램 종료");
		}
}

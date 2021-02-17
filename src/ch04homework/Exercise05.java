package ch04homework;

import java.util.Scanner;

public class Exercise05 { // Exam06 : 클래스 이름이라고 함.

	public static void main(String[] args) { // 메인 메서드
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			
			int num1 = Integer.parseInt(scanner.nextLine());
				
			if(num1 == 1){
				System.out.print("예금액>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 2){
				System.out.print("출금액>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 3){
				System.out.print("잔고>");
				Integer.parseInt(scanner.nextLine());
			}
			if(num1 == 4) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
	


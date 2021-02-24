package ch10.exam04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[3];
		
		// TODO Auto-generated method stub
		while(true) {
			try {
				System.out.print("저장위치:");
				int index = Integer.parseInt(scanner.nextLine());
				System.out.println("저장할값:");
				arr[index] = scanner.nextLine();
				
			} catch(NumberFormatException e) {
				System.out.println("숫자만 가능합니다.");
//				System.out.println("프로그램을 종료합니다.");
//				return; // 메소드 실행 종료 
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~" + (arr.length-1) + "까지 가능합니다.");
			} finally {
				System.out.println("다시 입력하세요.");
			}
		}
	}

}

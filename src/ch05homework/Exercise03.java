package ch05homework;

import java.util.Scanner;

public class Exercise03 {
	

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) { // 1을 읽었을 경우				
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) { // 2를 읽었을 경우
				for(int i=0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 3) { // 3를 읽었을 경우
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);	
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 4) { // 3를 읽었을 경우
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println("최고 점수:" + max);
				
				System.out.println("평균 점수:" + avg);
				//Integer.scanner.nextInt();
			} else if (selectNo == 5) { // 3를 읽었을 경우
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}

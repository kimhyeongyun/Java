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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� |5.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
			
//			int selectNo = scanner.nextInt();
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			
			
			if(selectNo == 1) { // 1�� �о��� ���				
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				
			} else if (selectNo == 2) { // 2�� �о��� ���
				for(int i=0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					// scores[i] = scanner.nextInt();
					
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 3) { // 3�� �о��� ���
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);	
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 4) { // 4�� �о��� ���
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i < scores.length; i++) {
					sum += scores[i];
					
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println("�ְ� ����:" + max);
				
				System.out.println("��� ����:" + avg);
				//Integer.scanner.nextInt();
				
			} else if (selectNo == 5) { // 5�� �о��� ���
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}

}

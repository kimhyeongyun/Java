package ch05homework;

import java.util.Scanner;

public class TeamProject01 {
	

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		boolean run = true;
		int sentenceNum = 0;
		String title = null;
		String content = null;
		String writer = null;
		String readNum = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("�޴�����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 1�� �о��� ���		
				
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("��ȣ         ����                      ����                        �۾���        ��ȸ��");
					System.out.println("---------------------------------------------------------------------------------");
				for(int i=0; i < boardArray.length; i++) {
					
					System.out.println(sentenceNum + "         " + title + "                      " + content + "                        " + writer + "        " + readNum );
				}
				
				System.out.print("�޴�����> ");
				sentenceNum = Integer.parseInt(scanner.nextLine());

			
			
			} else if (selectNo == 2) { // 2. ����(Create)
				for(int i=0; i < boardArray[0].length-2; i++) {
					System.out.print("����: ");
					title = scanner.nextLine();
					System.out.print("����: ");
					content = scanner.nextLine();
					System.out.print("�۾���: ");
					writer = scanner.nextLine();
					
					
					//scores[i] = Integer.parseInt(scanner.nextLine());
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 3) { // 3. �б�(Read)
				for(int i=0; i < boardArray.length; i++) {
					System.out.println("scores[" + i + "]> " + boardArray[i]);	}
				//Integer.scanner.nextInt();
			} else if (selectNo == 4) { // 4. ����(Update)
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i < boardArray.length; i++) {
					//sum += scores[i];
					//if(max < scores[i]) {
						//max = scores[i];
					//}
				}
				//avg = (double) sum / boardArray.length;
				//System.out.println("�ְ� ����:" + max);
				
				//System.out.println("��� ����:" + avg);
				//Integer.scanner.nextInt();
				
			} else if (selectNo == 5) { // 5. ����(Delete)
				
				
			} else if (selectNo == 6) { // 6. ����
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}

}

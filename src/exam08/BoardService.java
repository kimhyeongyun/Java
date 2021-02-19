package exam08;

import java.util.Arrays;

public class BoardService {
	// �ʵ�
	int count;
	String[][] boards; // �⺻������ null���� ���Ե�.
	/*
	 {
	 	{"1", "����1", "����1", "�۾���1", "3"},
	 	...
	 }
	 */
	
	// ������
	BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
    // �޼���
	int getNewBno() {
		return ++count;
	}
	void create(String title, String content, String writer, int hitcount) {
		int bno = getNewBno();
		String[] board = {
				"" + bno,
				title,
				content,
				writer,
				String.valueOf(hitcount)
		};
		for(int i=0; i < boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}	
		}
	}
	
	void showlist() {
		for(int i=0; i < boards.length; i++) {
			for(int j=0; j < boards[i].length; j++) {
				//System.out.print(boards[i][j]);
				System.out.print(boards[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	String[] read(int bno) { 
		String[] result = null; // �߿�
		
		String strBno = String.valueOf(bno);
		for(int i=0; i < boards.length; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
//					System.out.println(result);
					break;
				}
			}
		}
		return result; // �߿�
	}
}

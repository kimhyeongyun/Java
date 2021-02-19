package exam08;

import java.util.Arrays;

public class BoardService {
	// 필드
	int count;
	String[][] boards; // 기본적으로 null값이 대입됨.
	/*
	 {
	 	{"1", "제목1", "내용1", "글쓴이1", "3"},
	 	...
	 }
	 */
	
	// 생성자
	BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
    // 메서드
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
		String[] result = null; // 중요
		
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
		return result; // 중요
	}
}

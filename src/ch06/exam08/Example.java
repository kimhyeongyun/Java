package ch06.exam08;

public class Example {

	public static void main(String[] args) {
		
		BoardService bs = new BoardService(100,5); // 고정

		bs.create("제목1", "내용1", "글쓴이1", 3);
		bs.create("제목2", "내용2", "글쓴이1", 3);
		
//		bs.showlist();
		
//		bs.read(1);
		
		String[] board = bs.read(1);
		for(String value : board) {
			System.out.print(value + "\t");
		}
	}
}

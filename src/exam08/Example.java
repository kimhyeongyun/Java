package exam08;

public class Example {

	public static void main(String[] args) {
		
		BoardService bs = new BoardService(100,5); // ����

		bs.create("����1", "����1", "�۾���1", 3);
		bs.create("����2", "����2", "�۾���1", 3);
		
//		bs.showlist();
		
//		bs.read(1);
		
		String[] board = bs.read(2);
		for(String value : board) {
			System.out.print(value + "\t");
		}
	}
}

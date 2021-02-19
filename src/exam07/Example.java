package exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardService bs = new BoardService(); // 반드시 먼저 객체를 만들고 이 번지를 참조 변수에 대입하기.
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum(new int[] {1,2,3});
		System.out.println(sum);
		
		int[] arr2 = {1, 2, 3};
		sum = bs.getSum(arr2);
		System.out.println(sum);
		
		sum = bs.getSum2(1, 2, 3); // 개수가 정해진 것이 아닙니다. 
		sum = bs.getSum2(1, 2, 3, 4, 5);
		
		
	}

}

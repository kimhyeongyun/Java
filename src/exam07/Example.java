package exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardService bs = new BoardService(); // �ݵ�� ���� ��ü�� ����� �� ������ ���� ������ �����ϱ�.
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("����1", "����1");
		bs.save("����2", "����2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum(new int[] {1,2,3});
		System.out.println(sum);
		
		int[] arr2 = {1, 2, 3};
		sum = bs.getSum(arr2);
		System.out.println(sum);
		
		sum = bs.getSum2(1, 2, 3); // ������ ������ ���� �ƴմϴ�. 
		sum = bs.getSum2(1, 2, 3, 4, 5);
		
		
	}

}

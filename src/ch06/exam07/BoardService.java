package ch06.exam07;

public class BoardService {
	
	//Field
	int count;
	
	
	//Constructor
	
	
	//Method
	int getNewBno() {  // �ܺο��� �ҷ��� �ʿ䰡 ����.
	
		 // ���� �����ڿ� ���� ���̰� �Ǹ� ���̶� �ڶ� �޶��� 
		// ++count ���� 1�� �����ϰ� �ٸ� ������ �� / �ڿ� ������ ���� �ٸ� ������ �ϰ� ���߿� 1�� �߰� 	
		return ++count;
		/*for(int i=0; i<10; ++i) {
			                 i++ ��ġ �ٲ� �������. �ܵ����� ����Ͽ����Ƿ�.
		}*/
	}
	
	void save(String title, String content) { // return �� ���� �� ������ void�� ����.
		int bno = getNewBno();
		System.out.println(bno + "�� �����մϴ�.");
		System.out.println(title + "�� �����մϴ�.");
		System.out.println(content + "�� �����մϴ�.");
	}
		
	int getSum(int[] values) { // ������ ��� ���� �� �� ����.
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
		
	}
	
	int getSum2(int ... values) { // ������ ��� ���� �� �� ����.
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}

package ch06.exam07;

public class BoardService {
	
	//Field
	int count;
	
	
	//Constructor
	
	
	//Method
	int getNewBno() {  // 외부에서 불러올 필요가 없다.
	
		 // 대입 연산자와 같이 쓰이게 되면 앞이랑 뒤랑 달라짐 
		// ++count 먼저 1을 증가하고 다른 연산을 함 / 뒤에 있으면 먼저 다른 연산을 하고 나중에 1을 추가 	
		return ++count;
		/*for(int i=0; i<10; ++i) {
			                 i++ 위치 바뀌어도 상관없음. 단독으로 사용하였으므로.
		}*/
	}
	
	void save(String title, String content) { // return 값 받을 게 없으면 void로 시작.
		int bno = getNewBno();
		System.out.println(bno + "을 저장합니다.");
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "을 저장합니다.");
	}
		
	int getSum(int[] values) { // 개수가 몇개인 지는 알 수 없음.
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
		
	}
	
	int getSum2(int ... values) { // 개수가 몇개인 지는 알 수 없음.
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}

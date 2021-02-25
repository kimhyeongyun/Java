package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Integer var1 = new Integer(500); // 
//		Integer var2 = new Integer(500); // 

//		Integer var1 = 500; // 둘의 결과가 다르죠?
//		Integer var2 = 500; 
		
		
		
		Integer var1 = 10; // -128~127 자동 박싱된 객체들은 공유를 합니다.
		Integer var2 = 10;
		
		System.out.println(var1 == var2); // 이래서 되도록 ==을 쓰지 마세요!
		System.out.println(var1.equals(var2));
		
		
	}

}

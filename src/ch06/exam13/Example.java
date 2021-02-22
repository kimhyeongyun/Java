package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		
		// 생성자를 이용해서 객체 얻기
//		Singleton result1 = new Singleton();
//		Singleton result2 = new Singleton();
//		Singleton result3 = new Singleton();
//		Singleton result4 = new Singleton();
//		Singleton result5 = new Singleton();
		
		// 팩토리 메서드 이용해서 객체 얻기
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2 == result3) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}
}

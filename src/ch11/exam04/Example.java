package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class var1 = A.class; // A가 로딩된 번지다. 타입은 클래스 타입. 
//		System.out.println(var1);
		
		A a = new A();
		Class var2 = a.getClass();
		System.out.println(var2);
		
		// 리플렉션 : 클래서 안의 구성멤버들을 조사하는 것.
		
	}

}

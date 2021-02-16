package ch02;

public class Exam01 {

	public static void main(String[] args) {
		
		// 정수 타입의 변수 선언과 값 저장
		byte var1 = -128; //-128~127
		short var2 = 32767;
		int var3 = 2147483647; // 자바에서 정수를 사용할 때 주로 int를 사용
		long var4 = 20000000000000L;
		
		// 문자 타입의 변수 선언과 값 저장
		char var9 = 65; // char의 경우 음수를 저장할 수 없음
		char var10 = 'A'; // '' 안에는 문자가 딱 하나 와야함
		
		// 실수 타입의 변수 선언과 값 저장
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789; // 더블타입의 변수 var6에 2.5를 저장한다.
		// double 의 정밀도가 더 높다. 자바에서는 웬만해서 소수를 쓸 때 double을 사용
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		
		// 논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
		// int var9; // 인트타입의 변수 var9를 선언한다.
		var9 = 2; // var9에 2를 저장한다.
	}

}

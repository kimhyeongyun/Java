package ch03;

public class Exam01 {

	public static void main(String[] args) {
		
		// 산술연산의 다양한 형태
		
		int var1 = 1;
		// int 타입 변수 var1 선언하고 이 안에 1을 저장한다.
		
		var1 = var1 + 1;
		// = : 오른쪽에 있는 값을 왼쪽에 저장한다.
		var1 += 1;
		var1++;
		System.out.println("var1: " + var1);
		
		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		// 아무글자ㄴㅁㅇ
		// 아무글자
		System.out.println("var2: " + var2);
//ㅁㄴㅇㅁㄴㅇ
		int var3 = 16;
		var3 = var3 / 2;
		var3 /= 2;
		System.out.println("var3: " + var3);
		
		// 자바는 / (나눗셈)의 결과는 정수입니다.
		int var4 = 11;
		int var5 = 4;
		
		
	    double var6 = var4 / var5;
	    System.out.println("var6: " + var6);

	    double var7 = (double) var4 / var5;
	    System.out.println("var7: " + var7);

	    //나머지 구하기
	    int var8 = var4 % var5;
	    System.out.println("var8: " + var8);

		
		
		
	}

}

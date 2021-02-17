package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// 주사위를 던져 나오는 수 얻기(1, 2, 3, 4, 5, 6)
		// int value = ?;

		double temp = Math.random();
		// double 타입의 변수 temp 선언하다. temp 변수에 0에서 1사이의 무작위 실수를 저장한다.
		
		
		System.out.println(temp); // 범위 = [0, 1) 실수 : 0을 포함하고 1을 포함하지 않음
		// random() : 앞으로는 () <-이것을 method 호출라 부를 것, method 이름은 random이고 이것을 실행하겠다.
		System.out.println(temp * 6); // [0, 6) 실수
		System.out.println( (int) (temp * 6) ); // 0, 1, 2, 3, 4, 5 
		System.out.println( (int) (temp * 6) + 1); // 1, 2, 3, 4, 5, 6
		
		int value = (int) (temp * 6) + 1;
		
		System.out.println("value : " + value);
		
		if (value % 2 == 0) { // 나머지 연산
			System.out.println("짝수가 나왔어요.");
		} else {
			System.out.println("홀수가 나왔어요.");
		}
		
		
	}
}

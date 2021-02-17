package ch04;

public class Exam03 {

	public static void main(String[] args) {
		
		int store = 75; // false를 초기값이라 함
		
		System.out.println("A");
		
		if(store >= 90) {
			System.out.println("B1");
		} else if(store >= 80) {
			System.out.println("B2");
		} else  { // else가 꼭 있을 필요는 없음.
			System.out.println("B3");
		}
		
		System.out.println("C");
		
	}

}
